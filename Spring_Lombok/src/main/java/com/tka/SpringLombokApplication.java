package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLombokApplication.class, args);
		System.err.println("App started");
	}

}
