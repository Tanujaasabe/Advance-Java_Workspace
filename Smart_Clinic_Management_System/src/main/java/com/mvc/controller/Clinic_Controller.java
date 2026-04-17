package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.entity.User;
import com.mvc.service.UserService;

@Controller
public class Clinic_Controller {

	private final UserService s;
	
	public Clinic_Controller(UserService s)
	{
		super();
		this.s=s;
	}
	
	
	
	
	
}
