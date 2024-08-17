package org.classreviewsite.review.service;

import lombok.RequiredArgsConstructor;
import org.classreviewsite.auth.exception.AlreadyLikeException;
import org.classreviewsite.auth.exception.AlreadyWritePostException;
import org.classreviewsite.auth.exception.ReviewNotFoundException;
import org.classreviewsite.auth.exception.UserNotFoundException;
import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.review.data.Likes;
import org.classreviewsite.review.data.ClassReview;
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
    public List<ClassReview> findAll(){
        List<ClassReview> list = classReviewDataRepository.findAll();
        if(list.isEmpty()){
            throw new ReviewNotFoundException("수강 후기가 어디에도 없습니다.");
        }

        return list;
    }



    @Transactional
    public Long addReviewPost(ClassReviewRequest request){

        Lecture foundLecture = lectureService.findBylectureName(request.getLecName());

        User foundUser = userService.findById(request.getUserNumber()).orElseThrow(() -> new UserNotFoundException("존재하지 않는 학생입니다."));

        ClassReview classReview = ClassReview.builder()
                .lecId(foundLecture)
                .userNumber(foundUser)
                .starLating(request.getStarLating())
                .likes(0)
                .postTitle(request.getPostTitle())
                .postContent(request.getPostContent())
                .build();

        validateAddReviewPost(foundUser, foundLecture);

        Long resultStarLating = classReviewDataRepository.save(classReview).getStarLating();

        lectureService.updateReviewCount(foundLecture);
        lectureService.updateTotalStarLating(foundLecture, request.getStarLating());
        lectureService.updateAverageStarLating(foundLecture);

        return resultStarLating;

    }


    @Transactional(readOnly = true)
    public void validateAddReviewPost(User user, Lecture lecture){

       classReviewDataRepository.findByUserNumberAndLecId(user, lecture)
               .ifPresent(m -> {
                   throw new AlreadyWritePostException("이미 작성한 강의입니다.");
               });
    }

    @Transactional
    public void updateReviewPost(UpdateReviewRequest request){
        ClassReview post = new ClassReview();
        post.updatePost(request.getPostTitle(), request.getPostContent());

    }

    @Transactional
    public void deleteReviewPost(Long postId){
        ClassReview deletedClassReview = classReviewDataRepository.findById(postId).orElseThrow(() -> new NullPointerException("해당 강의가 존재하지 않습니다."));

        classReviewDataRepository.deleteById(postId);

        likesDataRepository.deleteAllByClassReview(deletedClassReview);

        Lecture updateLecture = lectureService.findById(deletedClassReview.getLecId().getLectureId());


        lectureService.cancelReviewCount(updateLecture);
        lectureService.cancelTotalStarLating(updateLecture, deletedClassReview.getStarLating());
        lectureService.updateAverageStarLating(updateLecture);

    }

    @Transactional
    public void addLikeReviewPost(LikeRequest request){
        // userNumber , reviewId
        User user = userService.findById(request.getUserNumber()).orElseThrow(() -> new UserNotFoundException("해당 학생이 존재하지 않습니다."));

        ClassReview classReview = classReviewDataRepository.findById(request.getReviewId()).orElseThrow(() -> new NullPointerException("해당 수강후기가 존재하지 않습니다."));

        // 좋아요 중복 검사
        validateLikeReviewPost(user, classReview);

        ClassReview likedPost = new ClassReview();

        likedPost.like();
        Likes likesUser = Likes.builder()
                .classReview(classReview)
                .user(user)
                .build();

        likesDataRepository.save(likesUser);

    }

    @Transactional(readOnly = true)
    public void validateLikeReviewPost(User user , ClassReview classReview){
        likesDataRepository.findByUserAndClassReview(user, classReview)
                .ifPresent(m -> {
                    cancelLikeReviewPost(user, classReview);
                }
                );
    }


    @Transactional
    public void cancelLikeReviewPost(User user , ClassReview classReview){
        classReview.cancelLike();
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


//    @Transactional(readOnly = true)
//    public List<ReviewPost> findByPostDetail(){
//
//    }

}
