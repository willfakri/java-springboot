package com.empresa.iniciardor_app.controller;

import com.empresa.iniciardor_app.domain.User;
import com.empresa.iniciardor_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<Map<String, String>> helloWorld(@PathVariable("id") Integer id,
                                                          @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
                                                          @RequestBody User body){
        Map<String, String> response = new HashMap<>();
        response.put("ID", id.toString());
        response.put("Nome", body.getName());
        response.put("Email", body.getEmail());
        response.put("Filter", filter);
        return ResponseEntity.ok(response);
    }
}
