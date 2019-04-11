package com.example.springboot.gradle.SpringPlayground1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/home")
    public  String getIndex(){
        return "GET  to index route";
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "These are tasks";
    }
}
