package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJpa3Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicJpa3Application.class, args);
		System.err.println("app stared");
	}

}
