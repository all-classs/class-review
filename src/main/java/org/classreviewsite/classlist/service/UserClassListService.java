package org.classreviewsite.classlist.service;

import lombok.RequiredArgsConstructor;
import org.classreviewsite.auth.exception.ClassNotFoundException;
import org.classreviewsite.auth.exception.UserNotFoundException;
import org.classreviewsite.classlist.dto.response.MyPageStudentInfo;
import org.classreviewsite.classlist.dto.response.UserClassListResponse;
import org.classreviewsite.classlist.infrastructure.UserClassListDataRepository;
import org.classreviewsite.user.data.User;
import org.classreviewsite.classlist.data.UserClassList;
import org.classreviewsite.user.infrastructure.UserDataRepository;
import org.classreviewsite.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserClassListService {


    private final UserClassListDataRepository userClassListDataRepository;

    private final UserService userService;


    @Transactional
    public void save(UserClassList userClassList){
        userClassListDataRepository.save(userClassList);
    }

    @Transactional(readOnly = true)
    public List<UserClassListResponse> findClassForSemester(int userNumber){

        List<UserClassList> list = userClassListDataRepository.findByUserNumberWithClassAndUser(userNumber);
        if(list.isEmpty()){
            throw new UserNotFoundException("해당 학생이 수강한 강의는 없습니다.");
        }

        return list.stream().map(UserClassListResponse::from).toList();

    }

    @Transactional(readOnly = true)
    public List<MyPageStudentInfo> myPageWithStudent(int userNumber){
        User user = userService.findById(Long.valueOf(userNumber)).orElseThrow(() -> new UserNotFoundException("해당 학생을 찾을 수 없습니다."));

        List<UserClassList> list = userClassListDataRepository.findByUserNumber(user).orElseThrow(() -> new ClassNotFoundException("해당 학생이 수강한 강의가 없습니다."));

        return MyPageStudentInfo.from(list);
    }

    @Transactional(readOnly = true)
    public UserClassList findByUserNumber(int userNumber, String lectureName){
        User user = userService.findById(Long.valueOf(userNumber));
        Lecture lecture = lectureService.findByLectureName(lectureName);
        UserClassList list = userClassListDataRepository.findByUserNumberAndLecture(user, lecture).orElseThrow(() -> new NoPermissionReviewException(""));
        System.out.println(list.getUserNumber());
        return list;
    }



}
