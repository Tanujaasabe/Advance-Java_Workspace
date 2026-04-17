package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.Employeeservice;

@RestController
public class EmployeeController {

	private Employeeservice s;
	
	public EmployeeController(Employeeservice s)
	{
		super();
		this.s=s;
	}
	
	@GetMapping("/msg")
	public String Hello()
	{
		return s.Hello();
	}
}
