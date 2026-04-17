package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJpa4Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicJpa4Application.class, args);
		System.err.println("app stared");
	}

}
