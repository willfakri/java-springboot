package com.empresa.iniciardor_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Olá!" + LocalDateTime.now();
    }
}
