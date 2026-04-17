package com.employee.service;

import java.util.List;

import com.employee.repo.EmployeeRepo;
import com.entity.Employee;

public class EmployeeSerive {

	EmployeeRepo r=new EmployeeRepo();
	public Integer addEmployee(Employee emp)
	{
		return r.addEmployee(emp);
	}
	
	

	public List<Employee>showAllEmployee()
	{
		return r.showAllEmployee();
	}
	
	
	public int updateemployebyid( int id ,Employee newemp)
	{
		return r.updateemployebyid(id, newemp);
	}
	
	public int deletebyid(int id)
	{
		
		return r.deletebyid(id);
	}
	
	public List<Employee>salarygrater(double amount)
	{
			return r.salarygrater(amount);
	}
	
	
	public List<Employee>getallrole(String role)
	{
	   return r.getallrole(role);
	}
	
	public List<Employee> maxSalary(){
		return r.maxSalary();
	}
}
