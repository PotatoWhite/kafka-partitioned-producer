package com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class LectureDto {
    private Long   id;
    private String title;
}
