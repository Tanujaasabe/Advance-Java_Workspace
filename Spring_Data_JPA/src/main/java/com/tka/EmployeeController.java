package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService s;
	
	@PostMapping("add")
	public Employee addemployee( @RequestBody Employee emp)
	{
		return s.addemployee(emp);
	}

	@GetMapping("show")
	public List<Employee> showEmp()
	{
		return s.showEmp();
	}
}
