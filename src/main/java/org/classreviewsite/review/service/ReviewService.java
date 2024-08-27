package org.classreviewsite.review.service;

import lombok.RequiredArgsConstructor;
import org.classreviewsite.auth.exception.AlreadyLikeException;
import org.classreviewsite.auth.exception.AlreadyWritePostException;
import org.classreviewsite.auth.exception.ReviewNotFoundException;
import org.classreviewsite.auth.exception.UserNotFoundException;
import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.review.data.Likes;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.review.dto.Request.DeleteReviewRequest;
import org.classreviewsite.review.dto.Response.ReviewInfo;
import org.classreviewsite.user.data.User;
import org.classreviewsite.lecture.service.LectureService;
import org.classreviewsite.review.dto.Request.LikeRequest;
import org.classreviewsite.review.dto.Request.ClassReviewRequest;
import org.classreviewsite.review.dto.Request.UpdateReviewRequest;
import org.classreviewsite.review.infrastructure.LikesDataRepository;
import org.classreviewsite.review.infrastructure.ClassReviewDataRepository;
import org.classreviewsite.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ClassReviewDataRepository classReviewDataRepository;

    private final LikesDataRepository likesDataRepository;

    private final LectureService lectureService;

    private final UserService userService;

    @Transactional(readOnly = true)
    public List<ReviewInfo> findAll(Long lectureId){
        List<ClassReview> list = classReviewDataRepository.findAll(lectureId);
        if(list.isEmpty()){
            throw new ReviewNotFoundException("수강 후기가 어디에도 없습니다.");
        }

        return ReviewInfo.toList(list);
    }



    @Transactional
    public Long addReviewPost(ClassReviewRequest request){

        Lecture foundLecture = lectureService.findBylectureName(request.getLectureName());

        User foundUser = userService.findById(request.getUserNumber()).orElseThrow(() -> new UserNotFoundException("존재하지 않는 학생입니다."));

        ClassReview classReview = ClassReview.builder()
                .lecId(foundLecture)
                .userNumber(foundUser)
                .starLating(request.getStarLating())
                .likes(0)
                .postTitle(request.getPostTitle())
                .postContent(request.getPostContent())
                .important(request.getImportant())
                .difficulty(request.getDifficulty())
                .funny(request.getFunny())
                .build();

        validateAddReviewPost(foundUser, foundLecture);

        Long id = classReviewDataRepository.save(classReview).getReviewId();

        Double funny = lectureService.updateFunnyAsPlus(foundLecture, classReview);
        Double difficulty = lectureService.updateDifficultyAsPlus(foundLecture, classReview);
        Double important = lectureService.updateImportantAsPlus(foundLecture, classReview);
        Double total = funny+difficulty+important;



        Long count = lectureService.addReviewCount(foundLecture);
        Long star = lectureService.updateTotalStarLating(foundLecture, request.getStarLating());
        Long result =  lectureService.updateAverageStarLating(foundLecture, star, count);

        if(foundLecture.getReviewCount()>0){
            lectureService.updateFunnyNormalization(foundLecture, funny/total);
            lectureService.updateDifficultyNormalization(foundLecture, difficulty/total);
            lectureService.updateImportNormalization(foundLecture, important/total);
        }

        return id;


    }


    @Transactional(readOnly = true)
    public void validateAddReviewPost(User user, Lecture lecture){

       classReviewDataRepository.findByUserNumberAndLecId(user, lecture)
               .ifPresent(m -> {
                   throw new AlreadyWritePostException("이미 작성한 강의입니다.");
               });
    }

    @Transactional
    public Long updateReviewPost(UpdateReviewRequest request){
        ClassReview post = classReviewDataRepository.findById(request.getPostId()).orElseThrow(() -> new ReviewNotFoundException("해당 수강후기가 존재하지 않습니다."));
        post.updatePost(request.getPostTitle(), request.getPostContent());
        return post.getReviewId();
    }

    @Transactional
    public void deleteReviewPost(DeleteReviewRequest request){
        User user = userService.findById(Long.valueOf(request.getUserNumber())).orElseThrow(() -> new UserNotFoundException("해당 학생이 존재하지 않습니다."));

        ClassReview deletedClassReview = classReviewDataRepository.findByReviewIdAndUserNumber(request.getPostId(), user).orElseThrow(() -> new NullPointerException("해당 수강후기가 존재하지 않습니다."));

        classReviewDataRepository.deleteById(request.getPostId());

        likesDataRepository.deleteAllByClassReview(deletedClassReview);

        Lecture updateLecture = lectureService.findById(deletedClassReview.getLecId().getLectureId());

        Double difficulty = lectureService.updateDifficultyAsMinus(updateLecture, deletedClassReview);
        Double important = lectureService.updateImportantAsMinus(updateLecture, deletedClassReview);
        Double funny = lectureService.updateFunnyAsMinus(updateLecture, deletedClassReview);
        Double total = difficulty+important+funny;


        Long count = lectureService.cancelReviewCount(updateLecture);
        Long star = lectureService.cancelTotalStarLating(updateLecture, deletedClassReview.getStarLating());
        lectureService.updateAverageStarLating(updateLecture, star, count);

        if(updateLecture.getReviewCount()>0){
            lectureService.updateImportNormalization(updateLecture, important/total);
            lectureService.updateFunnyNormalization(updateLecture, funny/total);
            lectureService.updateDifficultyNormalization(updateLecture, difficulty/total);
        }



    }

    @Transactional
    public String addLikeReviewPost(LikeRequest request){

        // userNumber , reviewId
        User user = userService.findById(Long.valueOf(request.getUserNumber())).orElseThrow(() -> new UserNotFoundException("해당 학생이 존재하지 않습니다."));

        ClassReview classReview = classReviewDataRepository.findById(request.getPostId()).orElseThrow(() -> new NullPointerException("해당 수강후기가 존재하지 않습니다."));

        try{
            validateLikeReviewPost(user, classReview);
        }catch (AlreadyLikeException exception){
            int like = classReview.cancelLike(classReview.getLikes()-1);
            likesDataRepository.deleteByClassReviewAndUser(classReview, user);
            return "좋아요가 취소되었습니다.";
        }


        int like = classReview.like();

        Likes likesUser = Likes.builder()
                .classReview(classReview)
                .user(user)
                .build();

        likesDataRepository.save(likesUser);

        return "좋아요가 추가되었습니다.";

    }

//    @Transactional
    public void validateLikeReviewPost(User user , ClassReview classReview){
        likesDataRepository.findByUserAndClassReview(user, classReview)
                .ifPresent(m -> {
            throw new AlreadyLikeException("좋아요가 취소 되었습니다.");
                }
                );
    }


    public void cancelLikeReviewPost(User user , ClassReview classReview){
        likesDataRepository.deleteByClassReviewAndUser(classReview, user);

        throw new AlreadyLikeException("좋아요가 취소되었습니다.");

    }


    // 좋아요 탑 3 수강후기 찾기
    @Transactional(readOnly = true)
    public List<ClassReview> findByLecIdOrderByLikes(Long lecId){
        return classReviewDataRepository.findByLecIdOrderByLikesDesc(lecId);
    }


    // 내 수강 후기 모두 찾기
    @Transactional(readOnly = true)
    public List<ClassReview> findMyReview(int userNumber){
        List<ClassReview> list = classReviewDataRepository.findByUserNumber(userNumber);
        if(list.isEmpty()){
            throw new ReviewNotFoundException("수강후기가 존재하지 않습니다.");
        }
        return list;
    }

    @Transactional(readOnly = true)
    public List<ClassReview> findByLecture(Long lecId){

        Lecture lecture = lectureService.findById(lecId);

        List<ClassReview> list = classReviewDataRepository.findByLecId(lecture);
        if(list.isEmpty()){
            throw new ReviewNotFoundException("수강후기가 존재하지 않습니다.");
        }
        return list;
    }

}
