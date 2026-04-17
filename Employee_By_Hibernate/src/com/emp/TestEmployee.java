package com.emp;


public class TestEmployee {

	public static void main(String[] args) throws ClassNotFoundException {
		 EmployeeReposiory r=new EmployeeReposiory();
		 
		 Employee e=new Employee(1,"tanuja","developer",20000);
		 
		 r.insertEmployee(e);
		 
		
		
	}
}
