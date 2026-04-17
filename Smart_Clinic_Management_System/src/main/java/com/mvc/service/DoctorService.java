package com.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.Repo.DoctorRepo;
import com.mvc.entity.Doctor;

@Service
public class DoctorService {
	
	private final DoctorRepo dr;
	

	public DoctorService(DoctorRepo dr)
	{
		super();
		this.dr=dr;
	}

	
	public Doctor findByUsername(String name) {
		return dr.findByUsername(name);
	}


	public Doctor findByEmail(String email) {
		// TODO Auto-generated method stub
		return findByEmail(email);
	}


	public Optional<Doctor> findById(Long doctorId) {
		
		  return dr.findById(doctorId);
		 
	}


	public List<Doctor> findAll() {
		
		return dr.findAll();
	}


	
	
}
