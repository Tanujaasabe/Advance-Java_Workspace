package com.tka.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Student;
import com.tka.repo.StudentRepo;


@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	 public Student saveStudent(Student student) {
	        return repo.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return repo.findAll();
	    }

	    public Student getStudentById(Long id) {
	        return repo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Student not found"));
	    }
	    
	    public Student updateStudent(Long id, Student student) {
	        Student  existing = repo.findById(id).orElseThrow();
	        existing.setName(student.getName());
	        existing.setCourse(student.getCourse());
	        existing.setMarks(student.getMarks());
	      
	        return repo.save(existing);
	    }
	    
	    
	   

	    public void deleteStudent(Long id) {
	        repo.deleteById(id);
	    }

}
