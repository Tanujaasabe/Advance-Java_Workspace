package com.tak.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.entity.User;
import com.tak.repo.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepo;
	
	
	public User register(User user)
	{
		return userRepo.save(user);
	}
	
	 public User login(String email, String password) {
		 User user = userRepo.findByEmail(email)
			        .orElseThrow(() -> new RuntimeException("User not found"));

			if (!user.getPassword().equals(password)) {
			    throw new RuntimeException("Invalid password");
			}

			return user;
}
}