package com.sk.demo.kafka.partition.springcloudstreamexample.events;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StudyCompleteCommand {
    private String email;

    private String title;
    private String learningType;

    private LocalDateTime closeTime;
}
