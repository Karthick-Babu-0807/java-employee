package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {

    @GetMapping("/")
    public String getMethod() {
        return "demo";
    }

    @GetMapping("/greetings")
    public String sayGreetings() {
        return "Hi There!";
    }
}
