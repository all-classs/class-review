package org.classreviewsite.review.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.classreviewsite.review.data.ClassReview;
import org.classreviewsite.review.dto.Request.LikeRequest;
import org.classreviewsite.review.dto.Request.ClassReviewRequest;
import org.classreviewsite.review.dto.Request.UpdateReviewRequest;
import org.classreviewsite.review.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "수강 후기정보 API ", description = "수강 후기 관련 요청입니다.")
public class ReviewController {

    /**

     수강 후기 전체 조회

     수강 후기 추가 요청

     수강 후기 수정 요청

     수강 후기 삭제 요청

     수강 후기 상세 페이지 조회

     수강 후기 좋아요 요청

     */

    private final ReviewService reviewService;

//    private final AuthService authService;


    @GetMapping("/review")
    @Operation(summary = "수강 후기 전체 목록 조회", description = "수강 후기 전체 목록을 조회합니다.")
    @ApiResponse(responseCode = "200", description = "수강 후기 전체 목록 조회입니다.")
    @ApiResponse(responseCode = "202", description = "수강 후기가 어디에도 없습니다.")
    public Result ReviewPostList(){
        List<ClassReview> response = reviewService.findAll();
        return new Result(200, response, "수강 후기 전체 목록 조회입니다.");
    }

    @PostMapping("/review")
    @Operation(summary = "수강 후기 작성 요청", description = "수강 후기 작성을 요청합니다.")
    @ApiResponse(responseCode = "200", description = "수강후기 작성이 완료되었습니다.")
    @ApiResponse(responseCode = "401", description = "해당 학생이 존재하지 않습니다.")
    @ApiResponse(responseCode = "40?", description = "해당 수강후기가 존재하지 않습니다.")
    public Result addReviewPost(@Parameter(required = true, description = "String postTitle, String postContent, Long starLating, String lecName, Long userNumber 를 json 형태로 body로 전송") @RequestBody ClassReviewRequest request
//                                @Parameter(description = "String token을 Header에 Authorization에 담아서 전송") @RequestHeader("Authorization") String token

    ){
//        authService.valid(token);
        reviewService.addReviewPost(request);

        return new Result(200, null, "수강후기 작성이 완료되었습니다.");
    }

    @DeleteMapping("/review")
    @Operation(summary = "수강 후기 삭제 요청", description = "수강 후기 삭제를 요청합니다.")
    @ApiResponse(responseCode = "200", description = "수강후기 삭제가 완료되었습니다.")
    public Result deleteReviewPost(@Parameter(required = true, description = "Long postId 만 body를 통해서 전송 {} 없이") @RequestBody Long postId
//                                   @Parameter(description = "String token을 Header에 Authorization에 담아서 전송") @RequestHeader("Authorization") String token
    ){
//        authService.valid(token);
        reviewService.deleteReviewPost(postId);
        return new Result(200, null, "수강후기 삭제가 완료되었습니다.");
    }

    @PatchMapping("/review")
    @Operation(summary = "수강 후기 수정 요청", description = "수강 후기 수정을 요청합니다.")
    @ApiResponse(responseCode = "200", description = "수강후기 수정이 완료되었습니다.")
    public Result updateReviewPost(@Parameter(required = true, description = "String postTitle, String postContent 를 json에 담아서 body로 전송") @RequestBody UpdateReviewRequest request
//                                   @Parameter(description = "String token을 Header에 Authorization에 담아서 전송")  @RequestHeader("Authorization") String token
    ){
//        authService.valid(token);
        // 수정쪽 예외 한번더 검토해야함
        reviewService.updateReviewPost(request);
        return new Result(200, null, "수강후기 수정이 완료되었습니다.");
    }

    @PostMapping("/review/like")
    @Operation(summary = "수강 후기에 좋아요 요청", description = "수강 후기 좋아요를 요청합니다.")
    @ApiResponse(responseCode = "200", description = "좋아요가 추가되었습니다.")
    @ApiResponse(responseCode = "202", description = "좋아요가 취소되었습니다.")
    public Result likeReviewPost(@Parameter(required = true, description = "Long userNumber, Long reviewId를 json에 담아서 body로 전송") @RequestBody LikeRequest request
//                                 @Parameter(description = "String token을 Header에 Authorization에 담아서 전송") @RequestHeader("Authorization") String token
    ){
//        authService.valid(token);
        reviewService.addLikeReviewPost(request);
        return new Result(200, null, "좋아요가 추가되었습니다.");
    }


    /**
     * 상세페이지 조회 필요
     */


    // 나의 수강후기
    @GetMapping("/myreview")
    public Result myReview(@RequestParam("userNumber") int userNumber){
        List<ClassReview> response = reviewService.findMyReview(userNumber);
        return new Result(200, response, "해당 학생의 수강후기입니다.");
    }


    // 해당 강의의 수강후기
    @GetMapping("/review/detail")
    public Result reviewByLecture(@RequestParam("lectureId") Long lectureId){
        List<ClassReview> response = reviewService.findByLecture(lectureId);
        return new Result(200, response, "해당 수강의 수강후기입니다.");
    }


    @Data
    @AllArgsConstructor
    class Result<T>{

        private int status;

        private T data;

        private String message;

    }



}
