package com.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmployeeReposiory {

	public void insertEmployee(Employee emp){
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml"); // make sure this file is in src/
	    cfg.addAnnotatedClass(Employee.class);
	    
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();

	    s.save(emp); 

	    tx.commit();
	    s.close();

	    System.out.println("Employees saved successfully!");
	}

}
