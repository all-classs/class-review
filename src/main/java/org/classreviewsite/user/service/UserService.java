package org.classreviewsite.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.user.dto.CreateUserRequest;
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
    public void signUp(CreateUserRequest user){

        validateDuplicateUser(user);

        String password = passwordEncoder.encode(user.getPassword());

        userDataRepository.save(User.toEntity(user, password));

    }


    private void validateDuplicateUser(CreateUserRequest user){

       userDataRepository.findByUserNumber(user.getUserNumber())
               .ifPresent(m -> {
            throw new UserExistException("이미 존재하는 학생입니다.");
        });


    }





}
