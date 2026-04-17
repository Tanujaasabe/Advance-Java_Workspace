package db.Spring_DB_Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService s;
	
	@PostMapping("add")
	public Employee addEmployee( @RequestBody Employee emp)
	{
		return s.addEmployee(emp);
	}

	
	  @GetMapping("show")
	    public List<Employee> showEmp() {
	        return s.showEmp();
	    }
	
	
	
	@PutMapping("updateemp")
	public String updateEmp(@RequestBody Employee emp)
	{
		 s.updateEmp(emp);
		return "Employee  updated successfully!";
	}
	
	
	@DeleteMapping("deleteemp/{id}")
	 public String deleteemp(@PathVariable int id)
     {
		  s.deleteemp(id);
		 return "Employee with ID " + id + " deleted successfully!";

     }
     
	    
}
