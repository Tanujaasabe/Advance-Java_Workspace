package com.mvc.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.Repo.AppointmentRepo;
import com.mvc.entity.Appointment;
import com.mvc.entity.Doctor;
import com.mvc.entity.User;
import com.mvc.service.DoctorService;
import com.mvc.service.PatientService;


@Controller
public class DoctorController {
	
private final DoctorService ds;

@Autowired
  private PatientService ps;

@Autowired
private AppointmentRepo appointmentRepo;
	
	public DoctorController(DoctorService ds)
	{
		super();
		this.ds=ds;
	}
	
	
	
	
	 
	 
	 @GetMapping("/doctor-dashboard")
	 public String doctorDashboard(Model m, HttpSession session) {

	     Doctor doctor = (Doctor) session.getAttribute("loggedInDoctor");

	     List<Appointment> list =
	    		 appointmentRepo.findByDoctorId(doctor.getId());

	     m.addAttribute("appointmentList", list);

	     return "doctor-dashboard";
	 }
	 
	 
	 @PostMapping("/savePrescription")
	 public String savePrescription(
	         @RequestParam String patientName,
	         @RequestParam String diagnosis,
	         @RequestParam String medicines,
	         @RequestParam String notes,RedirectAttributes ra) {

		 ra.addFlashAttribute("successMsg", "Prescription Saved Successfully ✅");
	     
	     return "redirect:/doctor-dashboard";
	 }
	 
	 
	 @GetMapping("/doctor-list")
	 public String showDoctorList(Model model) {

	     List<Doctor> doctorList = ds.findAll();
	     model.addAttribute("doctorList", doctorList);

	     return "doctor-list";
	 }


}
