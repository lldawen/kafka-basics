package com.dawen.springbootkafka;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "topicNiDawen",
            groupId = "groupId"
    )
    public void listener(String data) {
        System.out.println("Data received by the listener: " + data);
    }
}
