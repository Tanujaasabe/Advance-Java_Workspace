package com.tak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
@Table(name = "options")
public class Option {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String optionText;
	 
	 @JsonProperty("isCorrect")
	 private boolean isCorrect;
	 

	 
	 @ManyToOne
	 @JoinColumn(name = "question_id")
	 @JsonBackReference
	 private Question question;

	 public Option(long  id, String optionText, boolean isCorrect, Question question) {
		super();
		this.id = id;
		this.optionText = optionText;
		this.isCorrect = isCorrect;
		this.question = question;
	 }




	 public Option() {
		super();
	 }

 
	 

}
