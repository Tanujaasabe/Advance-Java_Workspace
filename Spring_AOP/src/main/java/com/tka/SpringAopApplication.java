package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(SpringAopApplication.class, args);
		System.out.println(context.getBeanDefinitionCount());
		System.err.println("app started");
	}

}
