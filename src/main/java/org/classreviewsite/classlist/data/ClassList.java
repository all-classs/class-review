package org.classreviewsite.classlist.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.classreviewsite.lecture.data.Lecture;
import org.classreviewsite.lecture.data.Professor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "ClassList")
public class ClassList {

    @Id
    @Column(nullable = false, length = 20, unique = true)
    private Long classNumber;

    @Column(columnDefinition = "TEXT", nullable = true, length = 255, unique = false)
    private String classIntroduction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecId")
    private Lecture lecture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professorId")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imageNumber", unique = false)
    private ImageUrl captainImage;



}
