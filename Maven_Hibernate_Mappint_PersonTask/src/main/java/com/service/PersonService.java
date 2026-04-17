package com.service;

import com.entity.Person;
import com.repo.PersonRepo;

public class PersonService {
	
	PersonRepo r=new PersonRepo();
	public void addPerson(Person person)
	{
		r.addPerson(person);
	}

}
