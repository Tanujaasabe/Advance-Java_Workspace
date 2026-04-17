
package com.mvc.controller;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.Repo.AppointmentRepo;
import com.mvc.entity.Appointment;
import com.mvc.entity.Doctor;
import com.mvc.entity.Patient;
import com.mvc.entity.User;
import com.mvc.service.DoctorService;
import com.mvc.service.PatientService;
import com.mvc.service.UserService;

@Controller
public class PatientController {
	
	@Autowired
	private DoctorService ds;
	 @Autowired
	    private PatientService service;
      @Autowired 
      private AppointmentRepo appointmentRepository;
		@Autowired 
		private UserService userservice;
	
		
		

	 
		@GetMapping("/patient-dashboard")
		public String patientDashboard(Model model, Principal principal) {
		    if (principal == null) {
		        return "redirect:/login"; // user logged in nahi hai
		    }

		    Patient patient = service.findByUsername(principal.getName());
		    if(patient == null) return "error-page";

		    model.addAttribute("patient", patient);
		    
		    List<Doctor> doctorList = ds.findAll();

		    model.addAttribute("doctorList", doctorList);
		    return "patient-dashboard";
		}

	
	    @GetMapping("/patients")
	    public String viewPatients(Model model) {
	        model.addAttribute("patients", service.getAllPatients());
	        return "patient-list";
	    }

	    @GetMapping("/addPatient")
	    public String showForm(Model model) {
	        model.addAttribute("patient", new Patient());
	        return "PatientForm";
	    }

	    @PostMapping("/savePatient")
	    public String savePatient(@ModelAttribute Patient patient) {
	        service.savePatient(patient);
	        return "redirect:/patients";
	    }
	    
	    @GetMapping("/deletePatient/{id}")
	    public String deletePatient(@PathVariable Long id) {
	        service.deletePatient(id);
	        return "redirect:/patients";
	    }
	    
	    
	  
	    @GetMapping("/add-appointment")
	    public String addAppointment() {
	        return "add-appointment";
	    }
	    
	    
	    
	    
	    
	   
	    
	    @PostMapping("/add-appointment")
	    public String addAppointment(@RequestParam long id,
	                                 @RequestParam String date,
	                                 @RequestParam String time,
	                                 HttpSession session,
	                                 RedirectAttributes ra) {

	        Patient patient = (Patient) session.getAttribute("loggedInPatient");

	        if(patient == null) {
	            return "redirect:/login";
	        }

	        Optional<Doctor> optionalDoctor = ds.findById(id);

	        if(optionalDoctor.isPresent()) {

	            Appointment ap = new Appointment();
	            ap.setPatient(patient);
	            ap.setDoctor(optionalDoctor.get());
	            ap.setDate(LocalDate.parse(date));
	            ap.setTime(LocalTime.parse(time));
	            ap.setStatus("Pending");

	            appointmentRepository.save(ap);

	            ra.addFlashAttribute("successMsg", "Appointment Booked Successfully ✅");
	        }

	        return "redirect:/patient-dashboard";
	    }
	    
	   
}
