package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tka.repo.Payment;

@Service
public class PymentService {
	
	
	@Autowired(required=true)
	//@Qualifier("phonePay")
	@Qualifier("gpay")
	private Payment p;
	
	public String pay() {
		return p.pay();
	}

}
