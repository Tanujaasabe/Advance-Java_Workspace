package com.mvc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.Repo.UserRepo;
import com.mvc.entity.User;

@Service
public class UserService {

	
	
	private final UserRepo R;
	
	public UserService(UserRepo R)
	{
		super();
		this.R=R;
	}
	

	public User saveuser(User u) {
		return R.save(u);
	}


	public User findByEmail(String email) {
		
		 return  R.findByEmail(email);
		
		
		}
	



	 public boolean validateUser(User user, String rawPassword) {
		  if (user == null) {
		        return false;  
		    }

		    if (user.getPassword() == null) {
		        return false;   
		    }

		    return user.getPassword().equals(rawPassword);
	   }


	 public User findByUsername(String name) {
		
		return R.findByUsername(name);
	 }

}
