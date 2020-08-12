package com.sk.demo.kafka.partition.springcloudstreamexample.logic;

import lombok.Getter;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

@Getter
@EnableBinding(StudyProducer.PartitionedSource.class)
public class StudyProducer {

    interface PartitionedSource {
        String output = "producer-stream";

        @Output(PartitionedSource.output)
        MessageChannel output();
    }

    public StudyProducer(PartitionedSource source) {
        this.source = source;
    }

    private PartitionedSource source;
//
//
//    public boolean S(final StudyStartCommand studyStartCommand) {
//        return source.output().send(MessageBuilder
//                                     .withPayload(studyStartCommand)
//                                     .setHeader("partitionKey", studyStartCommand.getEmail())
//                                     .build()
//
//        );
//    }
//
//    public boolean Update(final StudyCompleteCommand registerEvent) {
//        return source.output().send(MessageBuilder
//                                            .withPayload(registerEvent)
//                                            .setHeader("partitionKey", registerEvent.getEmail())
//                                            .build()
//
//        );
//    }

}
