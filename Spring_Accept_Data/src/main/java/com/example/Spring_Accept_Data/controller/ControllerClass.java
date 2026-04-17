package com.example.Spring_Accept_Data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@GetMapping("/name/{name}")
	public String enter_name(@PathVariable String name)
	{
		return "welcome...."+name;
	}
	
	
	@GetMapping("/addition/{a}/{b}")
	public String useraddition( @PathVariable int a, @PathVariable int b)
	{
		int c=a+b;
		return "sum..."+c;
		
	}
	
	@GetMapping("/show")
	public Employee showemployee()
	{
		Employee emp=new Employee(1,"Tanu",300000);
		System.out.println("console..."+emp);
		return emp;
	}
	
	
	@PostMapping("empdata")
	public Employee acceptEmp(@RequestBody Employee emp )
	{
		System.out.println("console...."+emp);
		return emp;
	}

}
