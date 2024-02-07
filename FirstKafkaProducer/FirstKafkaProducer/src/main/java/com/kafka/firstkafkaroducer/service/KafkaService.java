package com.kafka.firstkafkaroducer.service;

import com.kafka.firstkafkaroducer.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.Location_topic_name,location);
        this.logger.info("message produced");
        return true;
    }

    public boolean uploadVideo(String video) {
        kafkaTemplate.send(AppConstants.Location_topic_nameTwo,video);
        logger.info("New Video update sent");
        return true;
    }

    public boolean haiMessage(String msg) {
        kafkaTemplate.send(AppConstants.hai,msg);
        logger.info("msg sent");
        return true;
    }
}
