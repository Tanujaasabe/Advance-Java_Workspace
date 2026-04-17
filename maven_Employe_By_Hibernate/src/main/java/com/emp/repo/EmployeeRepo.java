package com.emp.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeRepo {
	
	public SessionFactory config()
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		return sf;
	}

	public void insertemployee(Employee emp)
	{
		Session s=config().openSession();
		Transaction tr=s.beginTransaction();
		Integer id=(Integer)s.save(emp);
		tr.commit();
		s.close();
		System.out.println(id+" ");
	}
}
