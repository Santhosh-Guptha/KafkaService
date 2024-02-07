package com.kafka.firstkafkaroducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstants.Location_topic_name)
                .build();
    }
    public NewTopic topicTwo(){
        return TopicBuilder
                .name(AppConstants.Location_topic_nameTwo)
                .build();
    }

    public NewTopic topicThree(){
        return TopicBuilder
                .name(AppConstants.hai)
                .partitions(2)
                .build();
    }
}
