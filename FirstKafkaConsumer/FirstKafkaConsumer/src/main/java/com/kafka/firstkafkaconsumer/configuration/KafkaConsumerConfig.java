package com.kafka.firstkafkaconsumer.configuration;

import com.kafka.firstkafkaconsumer.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = {AppConstants.LOCATION_UPDATE_TOPIC,AppConstants.Location_topic_nameTwo,AppConstants.hai},groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value){

        System.out.println(value);

    }
}
