package org.classreviewsite.classlist.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.classlist.data.ClassList;
import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.lecture.data.LectureType;
import org.classreviewsite.lecture.data.Professor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ClassListInfo {

    private Long lectureId;

//    private Long classNumber;

    private String lectureName;

    private String department;

    private String university;

    private LectureType lectureType;

    private Long averageStarLating;

    private String professor;

    private boolean opened;

    private String icon;

    public static class ClassListInfoWithMyPage{

    }


    public static List<ClassListInfo> toList(List<ClassList> classLists){

        List<ClassListInfo> list =  new ArrayList<>();

        for(ClassList classList: classLists){
            list.add(ClassListInfo.from(classList));
        }
        return list;

    }

    public static ClassListInfo from(ClassList classList){

        return new ClassListInfo(
                classList.getLecture().getLectureId(),
//                classList.getClassNumber(),
                classList.getLecture().getLectureName(),
                classList.getLecture().getDepartment(),
                classList.getLecture().getUniversity(),
                classList.getLecture().getLectureType(),
                classList.getLecture().getAverageStarLating(),
                classList.getProfessor().getProfessorName(),
                classList.isOpened(),
                classList.getIcon().getImageUrl()

        );
    }

}
