package com.tka;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
public class Employee implements Serializable {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
    private String name ;
    private String role ;
    private double salary ;
}
