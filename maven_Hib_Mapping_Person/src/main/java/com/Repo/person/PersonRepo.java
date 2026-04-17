package com.Repo.person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.person.Address;
import com.entity.person.Person;
import com.entity.person.VotingCard;


public class PersonRepo {

		private static SessionFactory config()
		{
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			return sf;
		}
		
		
		public void addperson(Person person, Address address, VotingCard votingCard)
		{
			Session s=config().openSession();
			Transaction tr=s.beginTransaction();
			s.save(person);
			s.save(address);
			s.save(votingCard);
			tr.commit();
			s.close();
		}
}
