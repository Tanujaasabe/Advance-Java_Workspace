package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String course;
	    private double marks;

	    public Student() {}

		public Student(Long id, String name, String course, double marks) {
			super();
			this.id = id;
			this.name = name;
			this.course = course;
			this.marks = marks;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}

		

}
