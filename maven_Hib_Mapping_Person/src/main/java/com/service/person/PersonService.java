package com.service.person;

import com.Repo.person.PersonRepo;
import com.entity.person.Address;
import com.entity.person.Person;
import com.entity.person.VotingCard;

public class PersonService {
	
	PersonRepo r=new PersonRepo();
	public void addperson(Person person, Address address, VotingCard votingCard)
	{
		r.addperson(person,address,votingCard);
	}

}
