package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/home")
	public String Home()
	{
		System.out.println("home page ");
		return "homepage";
	}
}
