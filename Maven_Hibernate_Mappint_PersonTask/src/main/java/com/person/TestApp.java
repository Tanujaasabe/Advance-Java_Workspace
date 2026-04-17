package com.person;

import com.controller.PersonController;
import com.entity.Address;
import com.entity.Person;
import com.entity.VotingCard;

public class TestApp {
	
	public static void main(String args[])
	{

		PersonController c = new PersonController();

		VotingCard tms = new VotingCard("Kothrud Pune");
		Address kpune = new Address("Karve Nagar");

		Person person = new Person(1212,"tanuja", tms, kpune);

		c.addPerson(person);


	}

}
