package org.classreviewsite.review.dto.Request;

import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LikeRequest {

    private int userNumber;

    private Long postId;

}
