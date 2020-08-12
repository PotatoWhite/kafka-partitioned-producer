package com.sk.demo.kafka.partition.springcloudstreamexample.logic.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StudyStartCommand {
    private String email;

    private String title;
    private String learningType;

    private LocalDateTime startTime;
}
