package org.classreviewsite.classlist.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserClassListResponse {

    private Long CompletionNumber;

    private String CompletionYear;

    private String CompletionType;

    private String grade;

    private String semester;

    private Long classNumber;

    private String lectureName;

    private String professorName;


}
