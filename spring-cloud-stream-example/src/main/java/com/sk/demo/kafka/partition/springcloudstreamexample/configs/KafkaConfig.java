package com.sk.demo.kafka.partition.springcloudstreamexample.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class KafkaConfig {
    @Bean
    public NewTopic createSampleTopic(){
        return new NewTopic("sample", 3, (short) 0);

    }
}
