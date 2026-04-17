package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicJpa1Application.class, args);
		System.err.println("App Started");
		}

}
