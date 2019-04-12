package com.fortiate.generator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.fortiate.generator.dataelements.DataElement;
import com.fortiate.generator.rupay.Transaction;

@Service
public class DataElementsSender {
	

    private static final Logger LOG = LoggerFactory.getLogger(DataElementsSender.class);

    @Autowired
    private KafkaTemplate<String, List<DataElement>> kafkaTemplate;

    @Value("${app.topic.example}")
    private String topic ;

    public void send(List<DataElement> list){
        LOG.info("sending data='{}' to topic='{}'", list, topic);

        Message<List<DataElement>> message = MessageBuilder
                .withPayload(list)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();
        
        System.out.println("reached heer 1");
        System.out.println(message);
        System.out.println("reached heer 2");
        
        kafkaTemplate.send(message);
    }
	

}
