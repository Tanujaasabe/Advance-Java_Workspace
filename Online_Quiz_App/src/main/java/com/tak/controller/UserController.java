package com.tak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tak.Service.UserService;
import com.tak.entity.User;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/user")

public class UserController {
	
	
	 @Autowired
	    private UserService userService;
	

	    // Register
	    @PostMapping("/register")
	    public ResponseEntity<User> register(@RequestBody User user) {
	        return ResponseEntity.ok(userService.register(user));
	    }

	  
	    
	    @PostMapping("/login")
	    public ResponseEntity<User> login(@RequestBody User user) {
	        return ResponseEntity.ok(userService.login(user.getEmail(), user.getPassword()));
	    }

}
