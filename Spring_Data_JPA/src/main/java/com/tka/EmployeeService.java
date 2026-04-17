package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo r;
	public Employee addemployee(Employee emp)
	{
		return r.save(emp);
		
	}
	
	public List<Employee>showEmp()
	{
		return r.findAll();
		
	}
	


	

}
