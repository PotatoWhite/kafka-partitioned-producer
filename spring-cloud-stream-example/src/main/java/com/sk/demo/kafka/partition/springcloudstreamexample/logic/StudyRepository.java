package com.sk.demo.kafka.partition.springcloudstreamexample.logic;

import com.sk.demo.kafka.partition.springcloudstreamexample.models.jpos.StudyJpo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudyRepository extends PagingAndSortingRepository<StudyJpo, Long> {
}
