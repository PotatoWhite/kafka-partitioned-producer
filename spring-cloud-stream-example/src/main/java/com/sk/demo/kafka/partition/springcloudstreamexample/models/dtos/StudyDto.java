package com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class StudyDto {
    private Long          id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private StudentDto    student;
    private LectureDto    lecture;

}
