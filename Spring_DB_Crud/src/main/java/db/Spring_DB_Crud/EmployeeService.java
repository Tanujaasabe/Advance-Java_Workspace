package db.Spring_DB_Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo r;
	
	
	public Employee addEmployee(Employee emp)
	{
		return r.addEmployee(emp);
	}



    public List<Employee> showEmp() {
        return r.showEmp();
   }

	
	public Employee updateEmp(Employee emp)
	{
		return r.updateEmp(emp);
	}
	
	
	 public Employee deleteemp(int id)
	{
	    return r.deleteemp(id);
     }
	
}
