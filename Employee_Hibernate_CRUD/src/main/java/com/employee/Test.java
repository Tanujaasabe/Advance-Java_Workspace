package com.employee;

import com.employee.controller.EmployeeController;
import com.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EmployeeController c=new EmployeeController();
		Employee e=new Employee(2,"tanu","dev",2345678);
		//c.addEmployee(e);
		
		
		
		
		Employee newemp = new Employee();
		newemp.setFullname("Tanu Updated");
		newemp.setRole("Senior Developer");
		newemp.setSalary(2500000);

		//c.updateemployebyid(2, newemp);
		
		c.showAllEmployee();
		//c.deletebyid(1);
		c.salarygrater(1000);
		c.getallrole("dev");
		c.showAllEmployee();
		c.maxSalary();

	}

}
