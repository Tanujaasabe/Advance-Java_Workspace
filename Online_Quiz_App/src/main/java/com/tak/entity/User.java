package com.tak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long userId;
private String name;
private String email;
private  String password;
private String role;


public User() {
	super();
}
public User(long userId, String name, String email, String password, String role) {
	super();
	this.userId = userId;
	this.name = name;
	this.email = email;
	this.password = password;
	this.role = role;
}


}
