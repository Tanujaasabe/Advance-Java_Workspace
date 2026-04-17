package com.tka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.User;
import com.tka.service.UserService;

@RestController
public class UserController {
	
	private UserService s;
	
	public UserController(UserService s)
	{
		super();
		this.s=s;
	}
	
	
	@PostMapping("saveuser")
	public User saveuser( @RequestBody User user)
	{
		return s.saveuser(user);
		
	}

}
