package org.classreviewsite.review.dto.Request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LikeRequest {

    private Long userNumber;

    private Long reviewId;

}
