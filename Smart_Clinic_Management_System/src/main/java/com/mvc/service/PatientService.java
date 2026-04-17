package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Repo.PatientRepo;
import com.mvc.entity.Patient;

@Service
public class PatientService {
	
	 @Autowired
	    private PatientRepo repository;

	    public Patient savePatient(Patient patient) {
	        return repository.save(patient);
	    }

	    public List<Patient> getAllPatients() {
	        return repository.findAll();
	    }

	    public void deletePatient(Long id) {
	        repository.deleteById(id);
	    }

		public Patient findByUsername(String name) {
			
			return repository.findByUsername(name);
		}

}
