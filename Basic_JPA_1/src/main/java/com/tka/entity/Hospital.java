package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Hospital {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String name;
	private String specialist;
	private double salary;
	
	public Hospital() {
		super();
	}
	public Hospital(long id, String name, String specialist, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
