package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService S;
	
	
	@PostMapping("/save")
	public Employee AddEmp( @RequestBody Employee emp)
	{
		return S.AddEmp(emp);
	}
	
	@GetMapping("show")
	public List<Employee> listEmp()
	{
		return S.listEmp();
	}
	
	
	@PutMapping("/updatedata/{id}")
	public Employee updatedata( @PathVariable int id, @RequestBody Employee emp)
	{
		return S.updatedata(id, emp);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int deletedata( @PathVariable int id)
	{
		return S.deletedata(id);
		
	}

}
