package org.classreviewsite.classlist.infrastructure;

import org.classreviewsite.classlist.data.ClassList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassListDataRepository extends JpaRepository<ClassList, Long> {


    @Query("select m from ClassList m join fetch m.lecture where m.lecture.lectureId = :lectureId")
    Optional<ClassList> findByLectureIdWithProfessorName(@Param("lectureId") Long lectureId);

    @Query("select m from ClassList m join fetch m.lecture join fetch m.professor join fetch m.captainImage where m.lecture.university = :university")
    List<ClassList> findClassListByUniversity(@Param("university") String university);

    @Query("select m from ClassList m join fetch m.lecture join fetch m.professor join fetch m.captainImage where m.lecture.university = :university and m.lecture.lectureId = :lectureId")
    List<ClassList> findClassListByUniversityAndLectureId(@Param("university") String university, @Param("lectureId") Long lectureId);

    @Query("select m from ClassList m join fetch m.lecture join fetch m.captainImage where m.professor.professorName = :professorName")
    List<ClassList> findClassListByProfessorName(String professorName);


}
