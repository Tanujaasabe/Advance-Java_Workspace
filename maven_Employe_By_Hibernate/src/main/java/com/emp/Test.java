package com.emp;

import com.emp.repo.EmployeeRepo;
import com.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EmployeeRepo r=new EmployeeRepo();
		Employee e=new Employee(1,"tanuja","dev",40000);
		r.insertemployee(e);
		
				

	}

}
