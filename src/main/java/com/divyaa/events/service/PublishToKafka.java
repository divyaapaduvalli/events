package com.divyaa.events.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Divyaa P
 */
@Service
public class PublishToKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send("baeldung", msg);
    }
}
