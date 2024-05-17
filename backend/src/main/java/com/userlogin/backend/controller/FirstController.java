package com.userlogin.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FirstController {
    
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
    
}
