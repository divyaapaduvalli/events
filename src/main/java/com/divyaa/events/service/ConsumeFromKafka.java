package com.divyaa.events.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Divyaa P
 */
@Service
public class ConsumeFromKafka {

    @KafkaListener(topics = "baeldung", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
