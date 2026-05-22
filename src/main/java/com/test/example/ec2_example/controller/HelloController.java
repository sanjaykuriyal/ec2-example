package com.test.example.ec2_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Map<String, Object> hello() {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Hello from Spring Boot");
        response.put("status", "success");
        response.put("timestamp", System.currentTimeMillis());

        return response;
    }
}
