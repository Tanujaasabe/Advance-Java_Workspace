package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.PymentService;

@RestController

public class PaymentController {
	

	    @Autowired
	    private PymentService service;

	    @GetMapping("/pay")
	    public String pay() {
	        return service.pay();
	    }

}
