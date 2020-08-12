package com.sk.demo.kafka.partition.springcloudstreamexample.controllers;

import com.sk.demo.kafka.partition.springcloudstreamexample.logic.StudyService;
import com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos.StudyDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studies")
public class StudyControllers {

    private StudyService studyService;

    @PostMapping
    public Long createStudy(@RequestBody StudyDto studyDto){


    }

}
