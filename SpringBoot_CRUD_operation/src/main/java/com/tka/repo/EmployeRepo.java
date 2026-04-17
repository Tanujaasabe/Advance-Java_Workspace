package com.tka.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employee;

@Repository

public class EmployeRepo {
	
	@Autowired
	private SessionFactory sf;
	
	public Employee AddEmp(Employee emp)
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		int savedata=(int) s.save(emp);
		tr.commit();
		s.close();
		return emp;
		
	}
	
	public List<Employee> listEmp()
	{
		Session s=sf.openSession();
		List<Employee>emp=s.createCriteria(Employee.class).list();
		return emp;
	}
	
	
	public Employee updatedata(int id,Employee emp)
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Employee em=s.get(Employee.class, id);
		if(em !=null)
		{
			em.setName(emp.getName());
			em.setAddress(emp.getAddress());
			em.setSalary(emp.getSalary());
		}
		
		tr.commit();
		s.close();
		return em;
	}
	
	public int deletedata(int id)
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Employee emp=s.load(Employee.class, id);
		s.delete(emp);
		tr.commit();
		s.close();
		return id;
		
	}

}
