package com.tak.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	private String answerText;
	
	
	 @ManyToOne
	    @JoinColumn(name = "attempt_id")
	    private Attempt attempt;
	 
	 
	 @ManyToOne
	    @JoinColumn(name = "question_id")
	    private Question question;
	 
	 
	 @ManyToOne
	    @JoinColumn(name = "selected_option_id")
	    private Option selectedOption;


	 public Answer() {
		super();
	 }


	 public Answer(Long id, Attempt attempt, Question question, Option selectedOption) {
		super();
		this.id = id;
		this.attempt = attempt;
		this.question = question;
		this.selectedOption = selectedOption;
	 }
	 
	 
	 

}
