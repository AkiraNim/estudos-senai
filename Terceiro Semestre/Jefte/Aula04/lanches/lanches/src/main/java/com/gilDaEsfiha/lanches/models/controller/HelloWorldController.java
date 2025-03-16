package com.gilDaEsfiha.lanches.models.controller;

import com.gilDaEsfiha.lanches.models.domain.User;
import com.gilDaEsfiha.lanches.models.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    /*
    Injeçao usando construtor

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }*/

    @GetMapping
    public String helloWorld(){

        return helloWorldService.helloWorld("Jorge");
    }
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "Nenhum") String filter, @RequestBody User body){
        return "Hello World "+ filter;
    }
}
