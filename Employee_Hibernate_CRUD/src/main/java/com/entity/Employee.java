package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String fullname;
	private String role;
	private double salary;

	public Employee() {
		super();
		
	}

	public Employee(int id, String fullname, String role, double salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.role = role;
		this.salary = salary;
	}
	
	

	public Employee(String fullname, String role, double salary) {
		super();
		this.fullname = fullname;
		this.role = role;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", role=" + role + ", salary=" + salary + "]";
	}

}
