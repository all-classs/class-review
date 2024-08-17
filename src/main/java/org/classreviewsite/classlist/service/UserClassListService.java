package org.classreviewsite.classlist.service;

import lombok.RequiredArgsConstructor;
import org.classreviewsite.auth.exception.ClassNotFoundException;
import org.classreviewsite.classlist.dto.response.UserClassListResponse;
import org.classreviewsite.classlist.infrastructure.UserClassListDataRepository;
import org.classreviewsite.user.data.User;
import org.classreviewsite.classlist.data.UserClassList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserClassListService {


    private final UserClassListDataRepository userClassListDataRepository;

    @Transactional(readOnly = true)
    public UserClassList findByUserNumber(User user){
        return userClassListDataRepository.findByUserNumber(user).orElseThrow(() -> new ClassNotFoundException("해당 학생은 수강한 교과목이 없습니다."));
    }

    @Transactional
    public void save(UserClassList userClassList){
        userClassListDataRepository.save(userClassList);
    }

    @Transactional(readOnly = true)
    public List<UserClassListResponse> findClassForSemester(int userNumber){

        List<UserClassList> list = userClassListDataRepository.findByUserNumberWithClassAndUser(userNumber);

        List<UserClassListResponse> result = new ArrayList<>();

        for(int i=0; i< list.size(); i++){
            result.add(i,
                    UserClassListResponse.builder()
                            .classNumber(list.get(i).getClassNumber().getClassNumber())
                            .semester(list.get(i).getSemester())
                            .grade(list.get(i).getGrade())
                            .CompletionType(list.get(i).getCompletionType())
                            .CompletionYear(list.get(i).getCompletionYear())
                            .lectureName(list.get(i).getClassNumber().getLecture().getLectureName())
                            .professorName(list.get(i).getClassNumber().getProfessor().getProfessorName())
                            .CompletionNumber(list.get(i).getCompletionNumber())
                            .build()
                    );
        }
        return result;

    }



}
