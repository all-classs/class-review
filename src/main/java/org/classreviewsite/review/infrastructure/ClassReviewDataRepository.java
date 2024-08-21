package org.classreviewsite.review.infrastructure;

import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.user.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassReviewDataRepository extends JpaRepository<ClassReview, Long> {

    @Query("select m from ClassReview m join fetch m.lecId join fetch m.userNumber")
    List<ClassReview> findAll();

    Optional<ClassReview> findByUserNumberAndLecId(@Param("userNumber") User userNumber, @Param("lecId") Lecture lecId);


    @Query("select m from ClassReview m where m.lecId = :lecId order by m.likes desc limit 3")
    List<ClassReview> findByLecIdOrderByLikesDesc(Long lecId );


    @Query("select m from ClassReview m where m.userNumber.userNumber = :userNumber")
    List<ClassReview> findByUserNumber(@Param("userNumber") int userNumber);


    List<ClassReview> findByLecId(@Param("LectureId") Lecture lecId);





}
