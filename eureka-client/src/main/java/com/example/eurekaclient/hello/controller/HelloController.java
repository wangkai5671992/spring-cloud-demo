package com.example.eurekaclient.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello," + name + "!!! (port : " + port + ")";
    }
}
