package org.classreviewsite.data_old;

import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.lecture.infrastructure.LectureDataRepository;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.review.infrastructure.ClassReviewDataRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class ReviewRepositoryTest {

    @Autowired
    ClassReviewDataRepository classReviewDataRepository;

    @Autowired
    LectureDataRepository lectureDataRepository;

    @Test
    @Transactional(readOnly = true)
    void findByLecIdOrderByStarLatingDesc(){
        Lecture lecture = lectureDataRepository.findById(1L).get();

        List<ClassReview> result = classReviewDataRepository.findAllByLecIdOrderByStarLatingDesc(lecture);// desc

        Assertions.assertNotNull(result.get(0));
    }

    @Test
    @Transactional(readOnly = true)
    void findByLecIdOrderByStarLatingAsc(){
        Lecture lecture = lectureDataRepository.findById(1L).get();

        List<ClassReview> result = classReviewDataRepository.findAllByLecIdOrderByStarLatingAsc(lecture);

        Assertions.assertNotNull(result.get(0));
    }

    @Test
    @Transactional(readOnly = true)
    void findByLecIdOrderByLikesDesc(){
        Lecture lecture = lectureDataRepository.findById(1L).get();
        List<ClassReview> result = classReviewDataRepository.findAllByLecIdOrderByLikesDesc(lecture);

        Assertions.assertNotNull(result.get(0).getPostTitle());
    }

    @Test
    @Transactional(readOnly = true)
    void findByLecIdOrderByLikesAsc(){
        Lecture lecture = lectureDataRepository.findById(1L).get();
        List<ClassReview> result = classReviewDataRepository.findAllByLecIdOrderByLikesAsc(lecture);

        Assertions.assertNotNull(result.get(0).getPostTitle());
    }

    @Test
    @Transactional(readOnly = true)
    void findByLecIdOrderByCreateDateDesc(){
        Lecture lecture = lectureDataRepository.findById(1L).get();

        List<ClassReview> result = classReviewDataRepository.findAllByLecIdOrderByCreatedDateDesc(lecture);

        Assertions.assertNotNull(result.get(0).getPostTitle());
    }

}
