package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-hello",fallback = ServiceHystrix.class)
public interface ServiceHello {

    @RequestMapping(value = "/hello/sayHello",method = RequestMethod.GET)
    String sayHello(@RequestParam String name);
}
