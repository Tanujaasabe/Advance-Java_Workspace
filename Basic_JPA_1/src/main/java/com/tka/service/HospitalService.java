package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Hospital;
import com.tka.repo.HospitalRepo;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepo r;
	
	public Hospital adddocutor(Hospital hospital) {
	 return r.save(hospital);
	}
	
	public List<Hospital> showdocutor()
	{
		return r.findAll();
	}

	public Hospital findusingId(long id)
	{
		return r.findById(id).orElseThrow();
	}
	public Hospital updatedata(Hospital hospital,long id)
	{
		Hospital hospital1=r.findById(id).orElseThrow();
		hospital1.setName(hospital.getName());
		hospital1.setSpecialist(hospital.getSpecialist());
		hospital1.setSalary(hospital.getSalary());
		r.save(hospital1);
		return hospital1;
		
		
	}
}
