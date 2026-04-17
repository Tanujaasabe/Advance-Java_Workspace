package com.tak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.tak")

public class OnlineQuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizAppApplication.class, args);
		System.err.println("App started");
	}

}
