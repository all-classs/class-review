package org.classreviewsite.review.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.user.dto.UserInfo;

import java.util.ArrayList;
import java.util.List;

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
