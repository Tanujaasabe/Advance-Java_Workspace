package com.mvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "doctors")
public class Doctor   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    private String specialization;

    private String phone;

    private String role;   // "Doctor"

    // Constructors
    public Doctor() {}

    public Doctor(String username, String specialization) {
        this.username = username;
        this.specialization = specialization;
    }
}

