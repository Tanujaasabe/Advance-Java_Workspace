package com.tka.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

	public class Gpay implements Payment {

	@Override
	    public String pay() {
	        return "Payment done using GPay";
	    }
	}

