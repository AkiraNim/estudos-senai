package com.akyrani.agregadordeinvestimentos;

import org.springframework.boot.SpringApplication;

public class TestAgregadordeinvestimentosApplication {

	public static void main(String[] args) {
		SpringApplication.from(AgregadordeinvestimentosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
