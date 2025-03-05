package com.gilDaEsfiha.lanches.configuration;

import com.gilDaEsfiha.lanches.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }
}
