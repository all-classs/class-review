package org.classreviewsite.lecture.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "Lecture")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lectureId" , nullable = false)
    private Long lectureId;

    @Column(nullable = false, length = 45 , unique = false)
    private String lectureName;

    @Column(nullable = true, unique = false)
    private Long averageStarLating;

    @Column(nullable = true, unique = false)
    private Long totalStarLating;

    @Column(nullable = true, unique = false)
    private Long reviewCount;

    @Column(nullable = false, length = 45, unique = false)
    private String department;

    @Column(nullable = false, length = 45, unique = false)
    private String university;

    @Enumerated(EnumType.STRING)
    private LectureType lectureType;

    @Column(nullable = false)
    private Double important;

    @Column(nullable = false)
    private Double difficulty;

    @Column(nullable = false)
    private Double funny;


    @ColumnDefault("0")
    @Column(nullable = true)
    private Double importantNormalization;

    @Column(nullable = true)
    @ColumnDefault("0")
    private Double difficultyNormalization;

    @Column(nullable = true)
    @ColumnDefault("0")
    private Double funnyNormalization;


    public Long updateAverageStarLating(Long updateLating){
        this.averageStarLating = updateLating;
        return this.averageStarLating;
    }

    public Long updateTotalStarLating(Long plusLating){
        this.totalStarLating = totalStarLating + plusLating;
        return this.totalStarLating;
    }

    public Long addReviewCount(Lecture lecture){

        this.reviewCount = reviewCount+1;
        return this.reviewCount;
    }

    public Long cancelTotalStarLating(Long minusLating){
        this.totalStarLating = totalStarLating - minusLating;
        return this.totalStarLating;
    }

    public Long cancelReviewCount(){
        this.reviewCount = reviewCount - 1;
        return this.reviewCount;
    }

    public Double updateImportant(Double important){
        this.important = important;
        return this.important;
    }

    public Double updateDifficulty(Double difficulty){
        this.difficulty = difficulty;
        return this.difficulty;
    }

    public Double updateFunny(Double funny){
        this.funny = funny;
        return this.funny;
    }

    public Double updateImportantNormalization(Double important){
        this.importantNormalization = important;
        return this.importantNormalization;
    }

    public Double updateDifficultyNormalization(Double difficulty){
        this.difficultyNormalization = difficulty;
        return this.difficultyNormalization;
    }

    public Double updateFunnyNormalization(Double funny){
        this.funnyNormalization  = funny;
        return this.funnyNormalization;
    }


}
