package tka.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String role;
	 private double salary;
	 public Employee(int id, String name, String role, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	 }
	 public Employee() {
		super();
	 }
	
	 
	 

}
