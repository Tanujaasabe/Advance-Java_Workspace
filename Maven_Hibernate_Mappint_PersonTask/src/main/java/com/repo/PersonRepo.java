package com.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Person;


public class PersonRepo {
	
	private static SessionFactory config()
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		return sf;
	}
	
	public void addPerson(Person person)
	{
		 Session s=config().openSession();
		 Transaction tr=s.beginTransaction();
		 s.save(person);
		 tr.commit();
		 s.close();
	}

}
