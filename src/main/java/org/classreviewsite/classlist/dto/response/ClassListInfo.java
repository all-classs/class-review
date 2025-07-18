package org.classreviewsite.classlist.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.auth.util.NumberFormat;
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
    private String lectureName;
    private String department;
    private String university;
    private LectureType lectureType;
    private Double averageStarLating;
    private String professor;
    private boolean opened;
    private String icon;

    public static ClassListInfo from(ClassList classList){
        return new ClassListInfo(
                classList.getLecture().getLectureId(),
                classList.getLecture().getLectureName(),
                classList.getLecture().getDepartment(),
                classList.getLecture().getUniversity(),
                classList.getLecture().getLectureType(),
                NumberFormat.format(classList.getLecture().getStarRating().getAverageRating()),
                classList.getProfessor().getProfessorName(),
                classList.isOpened(),
                classList.getIcon().getImageUrl()

        );
    }

}
