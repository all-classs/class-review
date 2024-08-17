package org.classreviewsite.review.infrastructure;

import org.classreviewsite.review.data.Likes;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.user.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesDataRepository extends JpaRepository<Likes, Long> {

    void deleteAllByClassReview(ClassReview classReview);

    Optional<Likes> findByUserAndClassReview(User user , ClassReview classReview);

    void deleteByClassReviewAndUser(ClassReview classReview, User user);


}
