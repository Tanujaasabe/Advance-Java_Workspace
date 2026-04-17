package com.tka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tka.repo.Gpay;
import com.tka.repo.Payment;
import com.tka.repo.PhonePay;

import tcs.Employee;

@Configuration
public class AppConfig {
	@Bean
	 public Employee employede()
	 {
		return new Employee();
	 }
	
}
