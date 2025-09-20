package com.empresa.iniciardor_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloService(String name){
        return "Olá, " + name;
    }
}
