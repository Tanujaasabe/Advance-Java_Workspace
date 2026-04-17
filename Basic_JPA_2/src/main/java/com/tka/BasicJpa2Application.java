package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicJpa2Application.class, args);
		System.err.println("App started");
	}

}
