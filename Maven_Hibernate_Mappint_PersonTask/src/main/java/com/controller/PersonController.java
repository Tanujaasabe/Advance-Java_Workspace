package com.controller;

import com.entity.Person;
import com.service.PersonService;

public class PersonController {
	
	PersonService s=new PersonService();
	public void addPerson(Person person)
	{
		s.addPerson(person);
	}


}
