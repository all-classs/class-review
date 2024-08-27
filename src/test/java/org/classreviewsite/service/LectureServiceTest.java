package org.classreviewsite.service;

import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.lecture.service.LectureService;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.review.dto.Request.ClassReviewRequest;
import org.classreviewsite.review.service.ReviewService;
import org.classreviewsite.user.data.User;
import org.classreviewsite.user.dto.CreateUserRequest;
import org.classreviewsite.user.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class LectureServiceTest {

    @Autowired
    LectureService lectureService;

    @Autowired
    ReviewService reviewService;

    @Autowired
    UserService userService;

    @Test
    @Transactional
    void updateReviewCountTest(){
        // given
        Lecture lecture = lectureService.findById(1L);
        User user = userService.findById(Long.valueOf(20191434)).get();
        User user2 = userService.findById(Long.valueOf(20191585)).get();


        ClassReview review1 = ClassReview.builder()
                .lecId(lecture)
                .postTitle("a")
                .postContent("a")
                .starLating(5L)
                .userNumber(user)
                .likes(0)
                .build();

        ClassReview review2 = ClassReview.builder()
                .lecId(lecture)
                .postTitle("a")
                .postContent("a")
                .starLating(3L)
                .userNumber(user2)
                .likes(0)
                .build();

        // when
        reviewService.addReviewPost(ClassReviewRequest.from(review1));
        Long result = reviewService.addReviewPost(ClassReviewRequest.from(review2));

        // then
        Assertions.assertEquals(4L, result);



    }





}
