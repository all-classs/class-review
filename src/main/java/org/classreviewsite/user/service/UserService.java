package org.classreviewsite.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.user.dto.CreateUserRequest;
import org.classreviewsite.user.dto.CreateUserResponse;
import org.classreviewsite.user.data.User;
import org.classreviewsite.auth.exception.UserExistException;
import org.classreviewsite.user.infrastructure.UserDataRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserDataRepository userDataRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional(readOnly = true)
    public Optional<User> findById(Long userNumber){
        return userDataRepository.findById(userNumber);
    }


    @Transactional
    public CreateUserResponse signUp(CreateUserRequest user){

        validateDuplicateUser(user);

        User savedUser = User.builder()
            .userNumber(user.getUserNumber())
            .userName(user.getUserName())
            .department(user.getDepartment())
            .nickname(user.getNickname())
            .password(passwordEncoder.encode(user.getPassword()))
            .build();


        userDataRepository.save(savedUser);

        return new CreateUserResponse(200, savedUser, "회원가입이 완료되었습니다.");
    }


    private void validateDuplicateUser(CreateUserRequest user){

       userDataRepository.findByUserNumber(user.getUserNumber())
               .ifPresent(m -> {
            throw new UserExistException("이미 존재하는 학생입니다.");
        });


    }





}
