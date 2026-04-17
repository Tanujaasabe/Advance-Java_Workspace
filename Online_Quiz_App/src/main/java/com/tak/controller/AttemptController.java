package com.tak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tak.Service.AttemptService;
import com.tak.entity.Attempt;
import com.tak.entity.AttemptRequest;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/attempt")
public class AttemptController {
	@Autowired
    private AttemptService attemptService;

	
	
	
	 @PostMapping("/submit/{quizId}")
	    public ResponseEntity<Attempt> submitQuiz(
	            @PathVariable int quizId,
	            @RequestBody AttemptRequest request) {

	        return ResponseEntity.ok(attemptService.submitQuiz(quizId, request));
	    }

}
