package com.controller.person;

import com.entity.person.Address;
import com.entity.person.Person;
import com.entity.person.VotingCard;
import com.service.person.PersonService;

public class PersonController {

	PersonService s=new PersonService();
	public void addperson(Person person, Address address, VotingCard votingCard)
	{
		s.addperson(person,address,votingCard);
	}
}
