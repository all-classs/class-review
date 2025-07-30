package org.classreviewsite.review.controller.data.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.common.util.NumberFormat;
import org.classreviewsite.review.infrastructure.ClassReview;
import org.classreviewsite.user.controller.data.response.UserResponse;

@Data
@AllArgsConstructor
public class ReviewInfo {

    private Long postId;

    private String postTitle;
    private String postContent;
    private Long starLating;
    private Integer likes;
    private String createDate;
    private UserInfo user;


    public static List<ReviewInfo> toList(List<ClassReview> reviews){
        List<ReviewInfo> list = new ArrayList<>();

        for(ClassReview classReview: reviews){
            list.add(
                    ReviewInfo.from(classReview)
            );
        }

        return list;
    }


    public static ReviewInfo from(ClassReview classReview){
        return new ReviewInfo(
                classReview.getReviewId(),
                classReview.getPostTitle(),
                classReview.getPostContent(),
                classReview.getStarLating(),
                classReview.getLikes(),
                "2024-01-01",
                UserInfo.from(classReview.getUserNumber())
        );
    }

}
