package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOperationApplication.class, args);
		System.err.println("App started");
	}

}
