package com.example.serviceribbon.speak.controller;

import com.example.serviceribbon.speak.service.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeakController {

    @Autowired
    SpeakService speakService;

    @GetMapping("/speakTo")
    public String speakTo(String name) {
        return speakService.speakHello(name);
    }
}
