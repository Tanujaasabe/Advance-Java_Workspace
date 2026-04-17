package tka.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tka.com.Service.EmpoService;
import tka.com.entity.Employee;

@RestController
@CrossOrigin("http://localhost:5173")
public class Employeecontroller {
	
	@Autowired
	private EmpoService s;
	
	
	@PostMapping("/save")
	public Employee AddEmp(@RequestBody Employee emp)
	{
		return s.AddEmp(emp);
	}

	@GetMapping("/allemp")
	public List<Employee> AllEmp()
	{
		return s.AllEmp();	
	}
	
	@PutMapping("/updatedata/{id}")
	public Employee Updatedata(@PathVariable int id,@RequestBody Employee emp)
	{
		return s.Updatedata(id, emp);
	}
	
	@DeleteMapping("/deletedata/{id}")
	public void Deletedata(@PathVariable int id)
	{
		s.Deletedata( id);
	}
}
