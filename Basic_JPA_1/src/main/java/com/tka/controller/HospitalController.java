package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Hospital;
import com.tka.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService s;
	
	@PostMapping("/add")
	public Hospital adddocutor( @RequestBody Hospital hospital)
	{
		return s.adddocutor(hospital);
	}
	
	@GetMapping("show")
	public List<Hospital> showdocutor()
	{
		return s.showdocutor();
	}

	@PutMapping("/{id}")
	public Hospital findusingId(@PathVariable long id)
	{
		return s.findusingId(id);
	}
	
	@PostMapping("/update/{id}")
	public Hospital updatedata( @RequestBody Hospital hospital, @PathVariable long id)
	{
		return s.updatedata(hospital, id);
	}
}
