package com.tka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
	
	@RequestMapping("/")
	
	@GetMapping("/hello")
	public String Hello()
	{
		return "welcome and hello";
	}
	
	
	 @GetMapping("/public/hello")
	    public String publicApi() {
	        return "Public API - No Login Required";
	    }

	    @GetMapping("/user/dashboard")
	    public String userApi() {
	        return "User Dashboard - USER or ADMIN can access";
	    }

	    @GetMapping("/admin/dashboard")
	    public String adminApi() {
	        return "Admin Dashboard - Only ADMIN can access";
	    }
}
