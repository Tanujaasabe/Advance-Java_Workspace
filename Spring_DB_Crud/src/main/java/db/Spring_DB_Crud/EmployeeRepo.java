package db.Spring_DB_Crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class EmployeeRepo {
	
	@Autowired
	private SessionFactory sf;


	public Employee addEmployee(Employee emp) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(emp);
		tr.commit();
		s.close();
		return emp;
	}
	
	
	
	public List<Employee> showEmp()
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		 Criteria c = s.createCriteria(Employee.class);
	       List<Employee> list = c.list();  

	        tr.commit();
            s.close();

	        return list;	
   	}
	
	
	
    public Employee updateEmp(Employee emp) {
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        Employee newEmp = s.get(Employee.class, emp.getId());
        if (newEmp != null) {
            newEmp.setName(emp.getName());
            newEmp.setRole(emp.getRole());
            newEmp.setSalary(emp.getSalary());
            s.update(newEmp);
        }
        tr.commit();
        s.close();
        return newEmp;
    }
    
    public Employee deleteemp(int id)
    {
    	 Session s = sf.openSession();
         Transaction tr = s.beginTransaction();
         Employee emp=s.load(Employee.class,id);
         s.delete(emp);
         tr.commit();
         s.close();
         return emp;
    }


	
}
