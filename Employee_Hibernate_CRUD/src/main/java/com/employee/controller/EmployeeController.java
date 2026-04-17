package com.employee.controller;

import java.util.List;

import com.employee.service.EmployeeSerive;
import com.entity.Employee;

public class EmployeeController {
	
	EmployeeSerive s=new EmployeeSerive();
	
	public Integer addEmployee(Employee emp)
	{
		return s.addEmployee(emp);
	}
	

	public List<Employee>showAllEmployee()
	{
		return s.showAllEmployee();
	}

	public int updateemployebyid( int id ,Employee newemp)
	{
		return s.updateemployebyid(id, newemp);
	}
	
	public int deletebyid(int id)
	{
		
		int row= s.deletebyid(id);
		if(s.deletebyid(id)>0)
		{
			System.out.println("deleted succesfully");
			
		}
		return row;
	}
	
	
	public List<Employee>salarygrater(double amount)
	{
		return s.salarygrater(amount);
	}
	
	public List<Employee>getallrole(String role)
	{
		return s.getallrole(role);
	}
	
	public List<Employee> maxSalary(){
		return s.maxSalary();
	}
}
