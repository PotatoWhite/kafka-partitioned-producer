package com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class StudentDto {
    private Long           id;
    private String         email;
    private String         name;
}
