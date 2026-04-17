package com.tak.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Question {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Long questionId;
	  private String questionText;
	  private String questionType;
	  private int marks;
	 
	
	  @ManyToOne
	  @JoinColumn(name = "quiz_id")
	  @JsonBackReference
	  private Quiz quiz;
	 
	 
	 
	 
	 
	
	 @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	 @JsonManagedReference
	 private List<Option> options;

	 public Question() {
		super();
	 }

	 public Question(long questionId, String questionText, String questionType, int marks, Quiz quiz) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.questionType = questionType;
		this.marks = marks;
		this.quiz = quiz;
	 }
	 
	 
	 
	 
}
