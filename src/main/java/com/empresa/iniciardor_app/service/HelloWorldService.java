package com.empresa.iniciardor_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    /**
     * Exemplo de uso do recurso javadoc /**
     * @param name
     * @return ola nome
     */
    public String helloService(String name){
        return "Olá, " + name;
    }
}
