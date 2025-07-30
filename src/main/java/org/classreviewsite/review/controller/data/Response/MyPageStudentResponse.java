package org.classreviewsite.review.controller.data.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.lecture.infrastructure.UserClassList;
import org.classreviewsite.lecture.data.LectureType;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class MyPageStudentInfo {
    //        private Long lectureId;
    private Long classNumber;
    private String lectureName;
    private String CompletionYear;
    private String grade;
    private String semester;
    private LectureType lectureType;
    private String professor;

        public static List<MyPageStudentInfo> from(List<UserClassList> classLists){
            List<MyPageStudentInfo> list = new ArrayList<>();

            for(UserClassList userClassList : classLists){
                list.add(
                        new MyPageStudentInfo(
                                userClassList.getClassNumber().getClassNumber(),
                                userClassList.getClassNumber().getLecture().getLectureName(),
                                userClassList.getCompletionYear(),
                                userClassList.getGrade(),
                                userClassList.getSemester(),
                                userClassList.getClassNumber().getLecture().getLectureType(),
                                userClassList.getClassNumber().getProfessor().getProfessorName()
                        )
                );
            }

            return list;
        }
}
