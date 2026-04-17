package com.tak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tak.Service.OptionService;
import com.tak.entity.Option;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/option")
public class OptionController {

	
	 @Autowired
	    private OptionService optionService;

	    // Add Option
	    @PostMapping("/{questionId}")
	    public ResponseEntity<Option> addOption(
	            @PathVariable int questionId,
	            @RequestBody Option option) {

	        return ResponseEntity.ok(optionService.AddOption(questionId, option));
	    }

	    // Get Options by Question
	    @GetMapping("/question/{questionId}")
	    public ResponseEntity<List<Option>> getOptions(@PathVariable int questionId) {
	        return ResponseEntity.ok(optionService.listoption(questionId));
	    }
}
