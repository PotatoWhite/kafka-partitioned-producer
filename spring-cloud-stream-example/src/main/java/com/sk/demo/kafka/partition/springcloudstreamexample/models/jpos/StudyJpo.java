package com.sk.demo.kafka.partition.springcloudstreamexample.models.jpos;

import com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos.StudyDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
public class StudyJpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private LocalDateTime startDate;

    @Temporal(TemporalType.DATE)
    private LocalDateTime endDate;

    @ManyToOne
    private StudentJpo student;

    @ManyToOne
    private LectureJpo lecture;

    public static StudyJpo of(StudyDto studyDto) {
        return StudyJpo.builder()
                .id(studyDto.getId())
                .endDate(studyDto.getEndDate())
                .startDate(studyDto.getStartDate())
                .lecture(LectureJpo.of(studyDto.getLecture()))
                .student(StudentJpo.of(studyDto.getStudent()))
                .build();

    }


    @PrePersist
    private void prePersist() {
        startDate = LocalDateTime.now();
    }
}
