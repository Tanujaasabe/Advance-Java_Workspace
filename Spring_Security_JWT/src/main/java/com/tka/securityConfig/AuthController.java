package com.tka.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.AuthRequest;
import com.tka.jwtUtil.JwtUtil;
import com.tka.service.CustomUserDetailsService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authManager;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private CustomUserDetailsService service;

	@PostMapping("/login")
	public String login(@RequestBody AuthRequest request) {

		authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

		UserDetails userDetails = service.loadUserByUsername(request.getUsername());

		return jwtUtil.generateToken(userDetails);
	}
}