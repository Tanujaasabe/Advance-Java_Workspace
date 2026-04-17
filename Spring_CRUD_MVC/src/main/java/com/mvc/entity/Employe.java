package com.mvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String role;
	 private double salary;

}
