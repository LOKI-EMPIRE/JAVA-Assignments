package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/api")
    public String helloWorld(){
        return "Hello World";
    }
}
