package com.entity.person;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private int age;
	
	
	@OneToOne
	@JoinColumn(name="vid")
	private VotingCard vcard;
	
	
	@ManyToOne

	@JoinColumn(name="addid")
	private Address address;


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int age, VotingCard vcard, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.vcard = vcard;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public VotingCard getVcard() {
		return vcard;
	}


	public void setVcard(VotingCard vcard) {
		this.vcard = vcard;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
}
