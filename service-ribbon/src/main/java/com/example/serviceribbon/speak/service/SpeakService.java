package com.example.serviceribbon.speak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpeakService {

    @Autowired
    RestTemplate restTemplate;

    public String speakHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello/sayHello?name=" + name, String.class);
    }

}
