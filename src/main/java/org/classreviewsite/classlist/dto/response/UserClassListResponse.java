package org.classreviewsite.classlist.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.classreviewsite.classlist.data.UserClassList;

import java.util.ArrayList;
import java.util.List;

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

    public static List<UserClassListResponse> toList(List<UserClassList> list){
        List<UserClassListResponse> result = new ArrayList<>();
        for(UserClassList userClassList : list){
            result.add(
                UserClassListResponse.from(userClassList)
            );
        }
        return result;
    }

    public static UserClassListResponse from(UserClassList userClassList){
        return UserClassListResponse.builder()
                .classNumber(userClassList.getClassNumber().getClassNumber())
                .semester(userClassList.getSemester())
                .grade(userClassList.getGrade())
                .CompletionType(userClassList.getCompletionType())
                .CompletionYear(userClassList.getCompletionYear())
                .CompletionNumber(userClassList.getCompletionNumber())
                .lectureName(userClassList.getClassNumber().getLecture().getLectureName())
                .professorName(userClassList.getClassNumber().getProfessor().getProfessorName())
                .build();
    }




}
