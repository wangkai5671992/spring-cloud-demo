package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHystrix implements ServiceHello {
    @Override
    public String sayHello(String name) {
        return "method erro : sayHello";
    }
}
