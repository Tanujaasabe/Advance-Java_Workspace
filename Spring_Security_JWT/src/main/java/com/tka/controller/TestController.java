package com.tka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/admin/data")
	public String adminData() {
		return "Only ADMIN can see this";
	}

	@GetMapping("/user/data")
	public String userData() {
		return "USER and ADMIN can see this";
	}
}