package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Account;
import com.tka.service.AccountService;

@RestController
public class AccountController {

	
	@Autowired
	private AccountService s;
	
	@RequestMapping("www.account.com")
	@PostMapping("add")
	public Account addaccount(@RequestBody Account ac)
	{
		return s.addaccount(ac);
	}
	
	@GetMapping("show")
	public List<Account>showaccount()
	{
		return s.addaccount();
	}
	
	@GetMapping("/{id}")
	public Account showid( @PathVariable long id)
	{
		return s.showid(id);
	}
	
	@PutMapping("update/{id}")
	public Account updatedata(@RequestBody Account ac,@PathVariable long id)
	{
		return s.updatedata(ac,id) ;
		
	}
}
