package com.empresa.iniciardor_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("dev")
public class IniciardorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniciardorAppApplication.class, args);
	}

}
