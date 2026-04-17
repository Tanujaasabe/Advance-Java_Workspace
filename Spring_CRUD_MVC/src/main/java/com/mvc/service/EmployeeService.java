package com.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.Repo.EmployeeRepo;
import com.mvc.entity.Employe;

@Service
public class EmployeeService {
	
	private final EmployeeRepo R;
	
	public EmployeeService(EmployeeRepo R)
	{
		super();
		this.R = R;	
	}
	
	public Employe ADDEmp(Employe emp) {
		return R.save(emp);
	}

	public List<Employe> showall() {
		
		return R.findAll();
	}
	
	
	public Employe getById(int id) {
		
		return R.findById(id).orElseThrow();
	}
	
	public Employe editdata(int id, Employe emp) {
        Employe newemp = R.findById(id).orElseThrow();
        newemp.setName(emp.getName());
        newemp.setRole(emp.getRole());
        newemp.setSalary(emp.getSalary());
        return R.save(newemp);
    }



	public void deleteById(int id) {
		R.deleteById(id);
		
	}


}
