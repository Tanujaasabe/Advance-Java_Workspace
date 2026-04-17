package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Employee;
import com.tka.repo.EmployeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeRepo R;
	
	
	public Employee AddEmp(Employee emp)
	{
		return R.AddEmp(emp);
	}
	
	public List<Employee> listEmp()
	{
		return R.listEmp();
	}
	
	public Employee updatedata(int id,Employee emp)
	{
		return R.updatedata(id, emp);
		
	}
	
	public int deletedata(int id)
	{
		return R.deletedata(id);
	}
	

}
