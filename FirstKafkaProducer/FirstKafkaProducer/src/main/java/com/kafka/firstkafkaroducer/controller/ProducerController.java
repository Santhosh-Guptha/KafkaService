package com.kafka.firstkafkaroducer.controller;

import com.kafka.firstkafkaroducer.service.KafkaService;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/home")
public class ProducerController {

    @Autowired
    private KafkaService service;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        this.service.updateLocation("("+Math.round(Math.random()*100)+" , "+Math.round(Math.random()*100)+" , "+Math.round(Math.random()*100)+")");
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }

    @PostMapping("/next")
    public ResponseEntity<?> uploadVideo(@RequestParam String name){
        service.uploadVideo(name);
        return new ResponseEntity<>(Map.of("message","Video sent"),HttpStatus.OK);
    }

    @PostMapping("/hai")
    public  ResponseEntity<?> hai(){
        service.haiMessage("haii");
        return new ResponseEntity<>(Map.of("message","msg sent"),HttpStatus.OK);
    }
}
