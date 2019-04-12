package com.example.springboot.gradle.SpringPlayground1.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring!";
    }

    @GetMapping("/math/pi")
    public  String getPI(){return "3.141592653589793";}

    @GetMapping("/math/calculate")
    public String calculate(@RequestParam(required=false) String operation,@RequestParam String x,@RequestParam String y ){
        switch (operation){
            case "add":
                return "4 + 6 = 10";
            case "multiply":
                return "4 * 6 = 24";
            case "subtract":
                return  "4 - 6 = -2";
            case "divide":
                return "30 / 5 = 6";
            default:
                return "30 + 5 = 35";
        }
    }
    @PostMapping("/math/sum")
    public String sum(@RequestParam MultiValueMap queryString ){
        String str="";
        int sum=0;
        for (Object obj:queryString.keySet())
        {
            sum=Integer.parseInt((String)queryString.get(obj));
            str=""+(String)queryString.get(obj);
        }
        return str+" = "+sum;
    }
}
