package org.classreviewsite.review.dto.Request;

import lombok.Data;

@Data
public class UpdateReviewRequest {

    Long postId;

    String postTitle;

    String postContent;
}
