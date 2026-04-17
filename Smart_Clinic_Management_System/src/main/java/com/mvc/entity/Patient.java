package com.mvc.entity;

import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String username;
    private String email;
    private String phone;
    private String role; 

    // One patient can have many appointments
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments; 

    // List of medical history strings
    @ElementCollection
    @CollectionTable(name = "patient_history", joinColumns = @JoinColumn(name = "patient_id"))
    @Column(name = "history")
    private List<String> medicalHistory;

    // List of prescriptions strings
    @ElementCollection
    @CollectionTable(name = "patient_prescriptions", joinColumns = @JoinColumn(name = "patient_id"))
    @Column(name = "prescription")
    private List<String> prescriptions;

    // Default constructor
    public Patient() { }

    // Parameterized constructor
    public Patient(String username, String email, String phone, String role,
                   List<String> medicalHistory, List<String> prescriptions, List<Appointment> appointments) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.medicalHistory = medicalHistory;
        this.prescriptions = prescriptions;
        this.appointments = appointments;
    }
}