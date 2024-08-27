package org.classreviewsite.review.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.classreviewsite.review.data.ClassReview;

@Builder
@Getter
@AllArgsConstructor
public class ClassReviewRequest {
    private String lectureName;
    private Long userNumber;
    private Long starLating;
    private String postTitle;
    private String postContent;

    private Long important;
    private Long funny;
    private Long difficulty;

    public static ClassReviewRequest from(ClassReview review){
        return new ClassReviewRequest(
                review.getLecId().getLectureName(),
                Long.valueOf(review.getUserNumber().getUserNumber()),
                review.getStarLating(),
                review.getPostTitle(),
                review.getPostContent(),
                review.getImportant(),
                review.getFunny(),
                review.getDifficulty()
        );
    }

    public static ClassReviewRequest of(String postTitle, String postContent, Long userNumber, Long starLating, String lectureName, Long important, Long funny, Long difficulty){
        return new ClassReviewRequest(
                lectureName,
                userNumber,
                starLating,
                postTitle,
                postContent,
                important,
                funny,
                difficulty
        );
    }
}
