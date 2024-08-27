package org.classreviewsite.lecture.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.classlist.service.ClassListService;
import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.auth.exception.LectureNotFoundException;
import org.classreviewsite.lecture.infrastructure.LectureDataRepository;
import org.classreviewsite.review.data.ClassReview;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LectureService {

    private final LectureDataRepository lectureDataRepository;

    private final ClassListService classListService;

    @Transactional(readOnly = true)
    public List<Lecture> findAll(){
        return lectureDataRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<String> findDistinctDepartment(){
        return lectureDataRepository.findDistinctDepartment();
    }


    @Transactional(readOnly = true)
    public Lecture findBylectureName(String lectureName){
        return lectureDataRepository.findByLectureName(lectureName).orElseThrow(() -> new LectureNotFoundException("존재하지 않는 강의입니다."));
    }


    // 인기도
    @Transactional(readOnly = true)
    public Long countByLectureName(String lectureName){
        Lecture lecture = lectureDataRepository.findByLectureName(lectureName).orElseThrow(() -> new LectureNotFoundException("존재하지 않는 강의입니다."));
        return lecture.getReviewCount();
    }



    @Transactional(readOnly = true)
    public Lecture findById(Long id){
        return lectureDataRepository.findById(id).orElseThrow(() -> new LectureNotFoundException("존재하지 않는 강의입니다."));
    }

    @Transactional(readOnly = true)
    public List<Lecture> findByUniversity(String university){
        List<Lecture> list = lectureDataRepository.findByUniversity(university);
        if(list.isEmpty()){
            throw new LectureNotFoundException("해당 대학의 강의가 존재하지 않습니다.");
        }
        return list;
    }

    @Transactional
    public Long addReviewCount(Lecture updateLecture){
        return updateLecture.addReviewCount(updateLecture);
    }

    @Transactional
    public Long updateTotalStarLating(Lecture updateLecture, Long plusLating){
        return updateLecture.updateTotalStarLating(plusLating);
    }

    @Transactional
    public Long updateAverageStarLating(Lecture updateLecture, Long totalStarLating, Long reviewCount){


        // 수강후기가 1개도 없어질때 0으로 연산하는거 예외
        if(reviewCount == 0L || totalStarLating == 0L){
            return updateLecture.updateAverageStarLating(0L);
        }

        Long updateAverageLating = totalStarLating/reviewCount;
        log.info("update star: {} {} {}", updateLecture.getLectureId(), updateAverageLating, reviewCount);

        Lecture lecture = lectureDataRepository.findByLectureName(updateLecture.getLectureName()).orElseThrow(() -> new LectureNotFoundException("강의가 존재하지 않습니다."));

        return updateLecture.updateAverageStarLating(updateAverageLating);
    }

    @Transactional
    public Long cancelTotalStarLating(Lecture updateLecture, Long minusLating){
        return updateLecture.cancelTotalStarLating(minusLating);
    }

    @Transactional
    public Long cancelReviewCount(Lecture updateLecture){
        return updateLecture.cancelReviewCount();
    }

    // score = (total/5) * 5
    @Transactional
    public Double updateImportantAsMinus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateImportant(updateLecture.getImportant()-review.getImportant());
    }

    @Transactional
    public Double updateFunnyAsMinus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateFunny(updateLecture.getFunny() - review.getFunny());
    }

    @Transactional
    public Double updateDifficultyAsMinus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateDifficulty(updateLecture.getDifficulty() - review.getDifficulty());
    }

    @Transactional
    public Double updateImportantAsPlus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateImportant(updateLecture.getImportant()+review.getImportant());
    }

    @Transactional
    public Double updateFunnyAsPlus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateFunny(updateLecture.getFunny() + review.getFunny());
    }

    @Transactional
    public Double updateDifficultyAsPlus(Lecture updateLecture, ClassReview review){
        return updateLecture.updateDifficulty(updateLecture.getDifficulty()+review.getDifficulty());
    }

    public Double updateImportNormalization(Lecture updateLecture, Double important){
        Lecture lecture = lectureDataRepository.findByLectureName(updateLecture.getLectureName()).get();
        return lecture.updateImportantNormalization(Double.valueOf(important*5));
    }

    public Double updateFunnyNormalization(Lecture updateLecture, Double funny){
        Lecture lecture = lectureDataRepository.findByLectureName(updateLecture.getLectureName()).get();
        return lecture.updateFunnyNormalization(Double.valueOf(funny*5));
    }

    public Double updateDifficultyNormalization(Lecture updateLecture, Double difficulty){
        Lecture lecture = lectureDataRepository.findByLectureName(updateLecture.getLectureName()).get();
        return lecture.updateDifficultyNormalization(Double.valueOf(difficulty*5));
    }

}
