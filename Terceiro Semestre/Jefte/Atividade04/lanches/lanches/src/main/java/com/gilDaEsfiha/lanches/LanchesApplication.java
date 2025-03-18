package com.gilDaEsfiha.lanches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class LanchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanchesApplication.class, args);
	}

}
