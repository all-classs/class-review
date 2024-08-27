package org.classreviewsite.classlist.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.classreviewsite.classlist.dto.response.ClassListWithProfessorName;
import org.classreviewsite.classlist.dto.response.MyPageStudentInfo;
import org.classreviewsite.classlist.dto.response.ProfessorDashboardInfo;
import org.classreviewsite.classlist.service.ClassListService;
import org.classreviewsite.classlist.service.UserClassListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyPageController {

    private final ClassListService classListService;

    private final UserClassListService userClassListService;

    @GetMapping("/mypage/professor")
    public Result myPageWithProfessor(@RequestParam("professorName") String professorName){

        List<ProfessorDashboardInfo> response = classListService.myPageWithProfessor(professorName);
        return new Result<>(200, response, "교수 대시보드 조회입니다.");
    }


    @GetMapping("/mypage/student")
    @Operation(summary = "마이페이지 학생 조회", description = "userNumber(학번)을 param으로 전송해주시면 해당 학생의 강의 조회를 합니다.")
    @ApiResponse(responseCode = "200", description = "학생의 마이페이지 강의 조회입니다.")
    @ApiResponse(responseCode = "401", description = "해당 학생을 찾을 수 없습니다")
    public Result myPageWithStudent(@RequestParam("userNumber") int userNumber){
        List<MyPageStudentInfo> response = userClassListService.myPageWithStudent(userNumber);
        return new Result<>(200, response, "학생의 마이페이지 강의 조회입니다.");
    }


    @Data
    @AllArgsConstructor
    class Result<T>{
        private int status;
        private T data;
        private String message;
    }
}
