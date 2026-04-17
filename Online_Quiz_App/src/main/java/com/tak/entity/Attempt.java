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
public class Attempt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attempt_id;
	 private int score;
	 private LocalDateTime attemptDate;
	
	
	@ManyToOne
    @JoinColumn(name = "userId")
    private User user;
	
	 @ManyToOne
	 @JoinColumn(name = "quizId")
	 private Quiz quiz;
	 
	 public Attempt() {
		super();
	 }

	 public Attempt(int id, int score, LocalDateTime attemptDate, User user, Quiz quiz) {
		super();
		this.attempt_id = id;
		this.score = score;
		this.attemptDate = attemptDate;
		this.user = user;
		this.quiz = quiz;
	 }



	 
	 
}
