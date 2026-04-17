package com.tak.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
public class AnswerRequest {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    private Long selectedOptionId; 
    private String answerText;
	public AnswerRequest(Long questionId, Long selectedOptionId, String answerText) {
		super();
		this.questionId = questionId;
		this.selectedOptionId = selectedOptionId;
		this.answerText = answerText;
	}
	public AnswerRequest() {
		super();
	}    

   
  
}
