package com.employee.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;

public class EmployeeRepo {
	
	private static  SessionFactory config()
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		return sf;
		
	}

	
	public Integer addEmployee(Employee emp)
	{
		Session s=config().openSession();
		Transaction tr=s.beginTransaction();
		Integer id=(Integer) s.save(emp);
		tr.commit();
		s.close();
		return id;
		
	}
	
	public List<Employee>showAllEmployee()
	{
		try( Session s=config().openSession())
		{
			List<Employee>emp=s.createCriteria(Employee.class).list();
			return emp;
		}
		
	}
	
	public int updateemployebyid( int id ,Employee newemp)
	{
		Session s=config().openSession();

	    Transaction tr = s.beginTransaction();  
	    Employee exemp = s.get(Employee.class, id);
		
		if(exemp!=null)
		{
			exemp.setFullname(newemp.getFullname());
			exemp.setRole(newemp.getRole());
			exemp.setSalary(newemp.getSalary());
			s.update(exemp);
			tr.commit();
			s.close();
			return exemp.getId();
		}
		else
		{
			return 0;
		}
		
	}
	
	public int deletebyid(int id) {

	    Session session = config().openSession();
	    Transaction tx = session.beginTransaction();

	    Employee emp = session.get(Employee.class, id);

	    if (emp != null) {
	        session.delete(emp);
	        System.out.println("Employee Deleted Successfully");
	    } else {
	        System.out.println("Employee ID Not Found");
	    }

	    tx.commit();
	    session.close();
		return id;
	}

	
	
	public List<Employee>salarygrater(double amount)
	{
		Session s=config().openSession();
		Criteria cr=s.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary", amount));
		List<Employee>emps=cr.list();
		return emps;
		
	}
	
	public List<Employee>getallrole(String role)
	{
		Session s=config().openSession();
		Criteria cr=s.createCriteria(Employee.class);
		cr.add(Restrictions.eq("role", role));
		List<Employee>emps=cr.list();
		
		for (Employee e : emps) {
		    System.out.println(
		        e.getId() + " " +
		        e.getFullname() + " " +
		        e.getRole() + " " +
		        e.getSalary()
		    );	
	}
		return emps;
	}
	
	
	public List<Employee> maxSalary() {

	    Session s = config().openSession();

	    // Step 1: Get Maximum Salary
	    Criteria empcr = s.createCriteria(Employee.class);
	    empcr.setProjection(Projections.max("salary"));

	    Double maxSalary = (Double) empcr.uniqueResult();

	    // Step 2: Fetch Employees Having Max Salary
	    Criteria cr = s.createCriteria(Employee.class);
	    cr.add(Restrictions.eq("salary", maxSalary));

	    List<Employee> emps = cr.list();

	    s.close();

	    return emps;
	}

}
