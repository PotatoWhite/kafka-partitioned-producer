package com.sk.demo.kafka.partition.springcloudstreamexample.logic;

import com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos.StudyDto;
import com.sk.demo.kafka.partition.springcloudstreamexample.models.jpos.StudyJpo;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    private final StudyRepository studyRepository;

    public StudyService(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public Long createStudy(StudyDto studyDto){
        var aStudy = StudyJpo.of(studyDto);
        studyRepository.save(studyDto);
    }

    public Long createStudy(StudyDto studyDto){
        var aStudy = StudyJpo.of(studyDto);
        studyRepository.save(studyDto);
    }
}
