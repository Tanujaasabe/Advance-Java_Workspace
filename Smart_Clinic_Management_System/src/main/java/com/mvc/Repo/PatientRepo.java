package com.mvc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entity.Doctor;
import com.mvc.entity.Patient;


	
	@Repository
	public interface PatientRepo extends JpaRepository<Patient,Long> {
		Patient findByUsername(String name);
	}


