package com.mvc.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "appointment")  // optional: fix table name if needed

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    private LocalTime time;
    private String status;
	public void setDoctor(Doctor doctor2) {
		this.doctor = doctor;
		
	}
	
	public void setTime(LocalTime localTime) {
		this.time=localTime;
		
	}
	
	
}