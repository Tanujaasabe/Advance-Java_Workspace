package com.tka;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	private final SessionFactory sf;

	public EmployeeRepository(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Employee saveEmployee(Employee emp) {

		Session session1 = sf.openSession();

		Transaction tr = session1.beginTransaction();

		Integer save = (Integer) session1.save(emp);

		tr.commit();

		Employee empdb = session1.get(Employee.class, save);

		return empdb;
	}

	public Employee fetchEmployee(int id) {

		Session session1 = sf.openSession();

		Session session2 = sf.openSession();

		Employee empdb1 = session1.get(Employee.class, id);

		Employee empdb2 = session2.get(Employee.class, id);

		System.out.println("employee from 1st = " + empdb1);

		System.out.println("employee from 2nd = " + empdb2);

		session1.close();
		session2.close();

		return empdb1;
	}

}


