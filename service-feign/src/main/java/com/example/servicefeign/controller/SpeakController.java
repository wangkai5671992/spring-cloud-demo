package com.example.servicefeign.controller;

import com.example.servicefeign.service.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeakController {

    @Autowired
    private ServiceHello serviceHello;

    @GetMapping("/speakTo")
    public String speakTo(String name){
        return serviceHello.sayHello(name);
    }
}
