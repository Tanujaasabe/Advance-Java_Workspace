package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class MainApp {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        emp.setSalary(50000);

        session.persist(emp);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Employee saved successfully!");
    }
}
