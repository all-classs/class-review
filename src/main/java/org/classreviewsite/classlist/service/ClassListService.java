package org.classreviewsite.classlist.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.classreviewsite.auth.exception.LectureNotFoundException;
import org.classreviewsite.classlist.dto.response.ClassListInfo;
import org.classreviewsite.classlist.dto.response.ClassListWithProfessorName;
import org.classreviewsite.classlist.dto.response.RecommendClassInfo;
import org.classreviewsite.classlist.infrastructure.ClassListDataRepository;
import org.classreviewsite.classlist.data.ClassList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClassListService {

    private final ClassListDataRepository classListDataRepository;

    @Transactional(readOnly = true)
    public ClassList findById(Long id){
        return classListDataRepository.findById(id).orElseThrow(() -> new NullPointerException("해당 클래스가 존재하지 않습니다."));
    }

    @Transactional(readOnly = true)
    public List<ClassListInfo> getByUniversity(String university){
            List<ClassList> list = classListDataRepository.findClassListByUniversity(university);
            if(list.isEmpty()){
                throw new NoSuchElementException("해당 학교의 강의가 존재하지 않습니다.");
            }
            return list.stream().map(ClassListInfo::from).toList();
    }

    @Transactional(readOnly = true)
    public ClassListWithProfessorName.ClassListWithProfessorNameInDetail detail(Long lectureId){
        ClassList classList = classListDataRepository.findByLectureIdWithProfessorName(lectureId).orElseThrow(() -> new LectureNotFoundException("해당 강의가 없습니다."));
        return ClassListWithProfessorName.ClassListWithProfessorNameInDetail.from(classList);
    }

    @Transactional(readOnly = true)
    public List<RecommendClassInfo> getRecommend(String university){
        List<RecommendClassInfo> list = classListDataRepository.findClassListByUniversityOrderByRandAndLimitThree(university);
        return list;
    }

}
