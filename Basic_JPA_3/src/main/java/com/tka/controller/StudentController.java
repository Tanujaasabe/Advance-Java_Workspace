package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	 @PostMapping("add")
	    public Student create(@RequestBody Student student) {
	        return service.saveStudent(student);
	    }

	    @GetMapping("show")
	    public List<Student> getAll() {
	        return service.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Student getById(@PathVariable Long id) {
	        return service.getStudentById(id);
	    }

	    @PutMapping("/{id}")
	    public Student update(@PathVariable Long id,
	                          @RequestBody Student student) {
	        return service.updateStudent(id, student);
	    }

	    @DeleteMapping("/{id}")
	    public String delete(@PathVariable Long id) {
	        service.deleteStudent(id);
	        return "Student Deleted Successfully";
	    }


}
