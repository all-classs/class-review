package org.classreviewsite.classlist.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.classlist.data.ClassList;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ProfessorDashboardInfo {
    private String lectureName;
    private String lectureRoom;


    public static List<ProfessorDashboardInfo> from(List<ClassList> classList){
        List<ProfessorDashboardInfo> list = new ArrayList<>();

        for(ClassList get: classList){
            list.add(
                    new ProfessorDashboardInfo(
                            get.getLecture().getLectureName(),
                            "101"
                    )
            );
        }
        return list;
    }
}
