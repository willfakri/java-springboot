package com.empresa.iniciardor_app.controller;

import com.empresa.iniciardor_app.domain.User;
import com.empresa.iniciardor_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloService("Brat");
    }

    @PostMapping("/{id}")
    public String helloWorld(@PathVariable("id") String id, @RequestBody User body){
        return  "ID: " + id +
                "\nNome: " + body.getName() +
                "\nEmail: " + body.getEmail();
    }
}
