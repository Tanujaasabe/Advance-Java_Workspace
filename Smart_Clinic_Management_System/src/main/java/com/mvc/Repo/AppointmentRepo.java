package com.mvc.Repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mvc.entity.Appointment;
import com.mvc.entity.Doctor;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Long> {

    int countByPatientIdAndDateAfter(Long patientId, LocalDate date);

    List<Appointment> findByPatientIdAndDateAfter(Long patientId, LocalDate date);

	int countUpcomingByPatient(Long id);

	List<Appointment> findUpcomingByPatientId(Long id);

	List<Appointment> findByDoctorId(Long id);
	
	
	
	
}
