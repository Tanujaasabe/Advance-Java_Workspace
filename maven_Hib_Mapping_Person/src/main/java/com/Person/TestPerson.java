package com.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.controller.person.PersonController;
import com.entity.person.Address;
import com.entity.person.Person;
import com.entity.person.VotingCard;

public class TestPerson {

	public static void main(String[] args) {
		
		PersonController c=new PersonController();
		
		VotingCard vc=new VotingCard(11223344,"kothrud","pune");
		Address ad=new Address(121212,"karvenagar","pune");
		
		Person p=new Person("Asabe Tanuja",21,vc,ad);
		
		c.addperson(p, ad, vc);
		
		

	}

}
