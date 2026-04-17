package com.tka.service;

import org.springframework.stereotype.Service;

import com.tka.entity.User;
import com.tka.repo.USerRepo;

@Service
public class UserService {
	
	private USerRepo ur;
	
	public UserService(USerRepo ur)
	{
		super();
		this.ur=ur;
	}
	
	public User saveuser(User user)
	{
		return ur.save(user);
		
	}

}
