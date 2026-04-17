package com.mvc.controller;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.entity.User;
import com.mvc.service.UserService;

@Controller
public class AuthControlller {
	
	
	private final UserService ss;
	
	public AuthControlller(UserService ss)
	{
		this.ss=ss;
	}
	
	@GetMapping("/")
	public String home() {
	    return "index";   // index.jsp
	}
	
	 @GetMapping("/signup")
	    public String showSignup() {
	        return "signup"; 
	    }
	
	 
	   @PostMapping("/signup")
	    public String signup(@ModelAttribute User u) {
	        ss.saveuser(u);
	        return "redirect:/login";
	    }
	
	
	   @GetMapping("/login")
	    public String showLogin() {
	        return "login"; 
	    }

	   
	   
	   @PostMapping("/login")
	   public String login(@RequestParam String email,
	                       @RequestParam String password,
	                       HttpSession session) {

	       User user = ss.findByEmail(email);

	       if(user != null && ss.validateUser(user, password)) {

	           if(user.getRole().equalsIgnoreCase("Doctor")) {
	               session.setAttribute("loggedDoctor", user);  // Doctor session
	               return "doctor-dashboard";

	           } else if(user.getRole().equalsIgnoreCase("Patient")) {
	               session.setAttribute("loggedInUser", user);  // Patient session
	               return "patient-dashboard";
	           }
	       }

	       return "redirect:/login?error=true";
	   }
	   
	    
	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "redirect:/login";
	    }

}
