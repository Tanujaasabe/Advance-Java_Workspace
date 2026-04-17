package com.tka.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  
public class PhonePay  implements Payment{

	@Override
	public String pay() {
		return "it is phone pay";
	}

}
