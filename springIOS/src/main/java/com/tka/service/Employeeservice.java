package com.tka.service;

import org.springframework.stereotype.Service;

import com.tka.repo.EmployeeRepo;

@Service
public class Employeeservice {
	
	private EmployeeRepo r;

	public Employeeservice(EmployeeRepo r)
	{
		super();
		this.r=r;
	}
	
	public String Hello()
	{
		return r.Hello();
	}
}
