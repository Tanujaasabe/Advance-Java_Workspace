package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  pincode ;

@Column(nullable=false)
	private String CityName;





	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address( String cityName) {
		super();
		CityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}

}
