package com.tak.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private int quizId;
	private String title;
	 private String description;
	  private String category;
	  private int duration;
	  private int totalMarks;
	  
	  
	  @OneToMany(mappedBy = "quiz")
	  @JsonManagedReference
	  private List<Question> questions;
	  
	  public Quiz() {
		super();
	  }

	  public Quiz(int quizId, String title, String description, String category, int duration, int totalMarks) {
		super();
		this.quizId=quizId;
		this.title = title;
		this.description = description;
		this.category = category;
		this.duration = duration;
		this.totalMarks = totalMarks;
	  }
	  
	  

}
