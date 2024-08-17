package org.classreviewsite.classlist.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.classreviewsite.classlist.dto.response.ClassListWithProfessorName;
import org.classreviewsite.classlist.dto.response.UserClassListResponse;
import org.classreviewsite.classlist.service.ClassListService;
import org.classreviewsite.classlist.service.UserClassListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClassListController {

    private final UserClassListService userClassListService;

    private final ClassListService classListService;


    @GetMapping("/class")
    public Result findUserClassList(@RequestParam("userNumber") int userNumber){

        List<UserClassListResponse> response = userClassListService.findClassForSemester(userNumber);

        return new Result(200, response, "해당 학생의 수강한 강의 목록입니다.");
    }

    @GetMapping("/lecture")
    public Result findLectureListAll(){
        List<ClassListWithProfessorName> list = classListService.findByClassListWithProfessorName();
        return new Result(200, list, "강의 전체 목록 조회입니다.");
    }

    @GetMapping("/lecture/detail")
    public Result findLectureDetail(@RequestParam("lectureId") Long lectureId){
        ClassListWithProfessorName.ClassListWithProfessorNameInDetail response = classListService.findByClassListWithProfessorNameInDetail(lectureId);
        return new Result(200, response, "강의 상세 정보 조회입니다.");
    }


    @Data
    @AllArgsConstructor
    class Result<T>{

        private int status;

        private T data;

        private String message;

    }
}
