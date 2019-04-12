package com.example.springboot.gradle.SpringPlayground1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/queryparam")
    public String getQueryIndividualParam(@RequestParam String filter){
        return "Request Parameter :filter value is::"+filter;
    }
}
