package com.example.randomapi.kafka.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonPublishService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void publish(String topic, Object msg) {
        kafkaTemplate.send(topic, msg);
    }
}
