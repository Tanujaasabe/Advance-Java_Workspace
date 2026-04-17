package tka.com.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tka.com.entity.Employee;
import tka.com.repo.EmpoRepo;

@Service
public class EmpoService {

	@Autowired
	private EmpoRepo r;
	
	public Employee AddEmp(Employee emp)
	{
		return r.save(emp);
		
	}
	
	public List<Employee> AllEmp()
	{
		List<Employee>emp=r.findAll();	
		return  emp;	
	}
	
	public Employee Updatedata(int id, Employee emp) {
	    Employee emp1 = r.findById(id)
	                     .orElseThrow(() -> new RuntimeException("Employee not found"));

	    emp1.setName(emp.getName());
	    emp1.setRole(emp.getRole());
	    emp1.setSalary(emp.getSalary());

	    return r.save(emp1);
	}
	
	

	public void Deletedata(int id) {
		Employee emp1 = r.findById(id).orElseThrow();;
	        r.delete(emp1);
	    }
	
}
