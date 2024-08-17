package org.classreviewsite.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.auth.jwt.JwtTokenProvider;
import org.classreviewsite.user.service.UserService;
import org.classreviewsite.user.dto.CreateUserRequest;
import org.classreviewsite.user.dto.LoginUserRequest;
import org.classreviewsite.user.dto.CreateUserResponse;
import org.classreviewsite.user.dto.LoginUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@Slf4j
@RequiredArgsConstructor
@Tag(name = "유저 정보 API", description = "유저 정보 관련 요청입니다.")
public class UserController {

   private final UserService userService;

   private final JwtTokenProvider jwtTokenProvider;
   private final AuthenticationManagerBuilder authenticationManagerBuilder;

   private final PasswordEncoder passwordEncoder;

    /**
     * 로그인
     */
    @PostMapping("/signin")
    @Operation(summary = "로그인 요청", description = "로그인을 요청합니다.")
    @ApiResponse(responseCode = "200", description = "로그인을 성공하였습니다.")
    @ApiResponse(responseCode = "401", description = "학번은 8자리입니다.")
    @ApiResponse(responseCode = "401", description = "아이디 및 비밀번호를 확인해주세요")
    public Result signIn(@Parameter(required = true, description = "학번, 비밀번호 요청") @RequestBody LoginUserRequest dto){
        log.info("password: {}", passwordEncoder.encode(dto.getPassword()));

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(dto.getUserNumber(), dto.getPassword());

        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        log.info("로그인: {}", authentication);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenProvider.createToken(authentication);

            return new Result<>(
                    LoginUserResponse.of(200, authentication.getName() , token, "로그인을 성공하였습니다.")
            );
    }


    /**
     * 회원가입
     */
    @PostMapping("/signup")
    @Operation(summary = "회원가입 요청", description = "회원가입을 요청합니다.")
    @ApiResponse(responseCode = "200", description = "회원가입이 완료되었습니다.")
    @ApiResponse(responseCode = "204", description = "이미 존재하는 학생입니다.")
    public Result signUp( @RequestBody CreateUserRequest dto){
        log.info("회원가입: {}" , dto);
        CreateUserResponse response = userService.signUp(dto);
        return new Result<>(response);
    }

    @Data
    @AllArgsConstructor
    class Result<T>{
        private T data;
    }




}
