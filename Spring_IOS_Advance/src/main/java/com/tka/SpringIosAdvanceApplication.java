package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com","tcs"})
public class SpringIosAdvanceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringIosAdvanceApplication.class, args);
		System.err.println("app started");
		System.out.println(context.getBeanDefinitionCount());
		String[]beanDefinitionNames=context.getBeanDefinitionNames();
		  for (String beanName : beanDefinitionNames) {
		        System.out.println(beanName);
		    }
		
	}

}
