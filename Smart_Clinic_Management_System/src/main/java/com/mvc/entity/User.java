package com.mvc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int userId;
	    private String username;
	    private String email;
	    private String phone;
	    private String password;
	    private String role;
	    private String name;
	    private String specialization;
	    
	    @ElementCollection
	    @CollectionTable(name = "medical_history",
	            joinColumns = @JoinColumn(name = "user_id"))
	    @Column(name = "history")
	    private List<String> medicalHistory;

	    @ElementCollection
	    @CollectionTable(name = "prescriptions",
	            joinColumns = @JoinColumn(name = "user_id"))
	    @Column(name = "prescription")
	    private List<String> prescriptions;

	    
	   
	    

}
