package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Account;
import com.tka.repo.AccountRepo;

@Service
public class AccountService {

	@Autowired
	private AccountRepo r;
	
	public Account addaccount(Account ac)
	{
		 return r.save(ac);
	}

	public List<Account> addaccount() {
		
		return r.findAll();
	}

	public Account showid(long id) {
		return r.findById(id).orElseThrow();
	}

	

	public Account updatedata(Account ac,long id) {
		 Account ac1 = r.findById(id)
		            .orElseThrow(() -> new RuntimeException("Account not found"));

		    ac1.setAccountHolderName(ac.getAccountHolderName());
		    ac1.setBalance(ac.getBalance());

		    return r.save(ac1);
	}
}
