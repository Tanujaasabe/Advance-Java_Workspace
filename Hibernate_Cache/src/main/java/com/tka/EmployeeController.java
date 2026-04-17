package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private final EmployeeRepository er;

	public EmployeeController(EmployeeRepository er) {
		super();
		this.er = er;
	}

	@PostMapping("add")
	public Employee saveEmployee(@RequestBody Employee emp) {

		return er.saveEmployee(emp);
	}

	@GetMapping("findbyid/{id}")
	public Employee fetchEmployee(@PathVariable int id) {
		return er.fetchEmployee(id);
	}
}
