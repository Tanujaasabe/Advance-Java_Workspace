package com.entity.person;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	private int addid;

@Column(nullable=false,unique=true)
	private int pin;


@Column(nullable=false)
	private String area;

@Column(nullable=false)
	private String city;


@OneToMany(mappedBy="address")
private List<Person> persons;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int pin, String area, String city) {
	super();
	this.pin = pin;
	this.area = area;
	this.city = city;
}

public int getAddid() {
	return addid;
}

public void setAddid(int addid) {
	this.addid = addid;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}




}
