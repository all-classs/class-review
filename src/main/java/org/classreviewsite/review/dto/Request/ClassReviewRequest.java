package org.classreviewsite.review.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class ClassReviewRequest {
    private String LecName;
    private Long UserNumber;
    private Long StarLating;
    private String PostTitle;
    private String PostContent;
}
