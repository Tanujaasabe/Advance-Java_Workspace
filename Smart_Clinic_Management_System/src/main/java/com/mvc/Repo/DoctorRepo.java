package com.mvc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entity.Doctor;
import com.mvc.entity.User;

	
	@Repository
	public interface DoctorRepo extends JpaRepository<Doctor,Long> {
		Doctor findByUsername(String name);

		Object findById(Doctor doctorId);
	}

