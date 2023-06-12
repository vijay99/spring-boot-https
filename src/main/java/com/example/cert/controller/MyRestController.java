package com.example.cert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/https")
public class MyRestController {

    @GetMapping("/getHttpMsg")
    public String httpsMethod(){
        return "This is accessed by HTTPS protocol!";
    }
}
