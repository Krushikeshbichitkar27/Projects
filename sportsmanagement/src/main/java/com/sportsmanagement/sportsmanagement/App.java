package com.sportsmanagement.sportsmanagement;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
//declaring class
public class App {
	// calling main method
	public static void main(String[] args) {
		// Create Configuration
		Configuration configuration = new Configuration();
		(configuration).configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(SportsManagement.class);

		// Create Session Factory
		SessionFactory sessionFactory = (SessionFactory) configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = ((org.hibernate.SessionFactory) sessionFactory).openSession();

		SportsManagement sp1 = new SportsManagement();

		sp1.setId(1);
		sp1.setPlayerFirstiName("Rohit");
		sp1.setPlayerLastName("Sharma");
		sp1.setAge(35);
		sp1.setAddress("Mumbai");
		sp1.setCategory("Criket");

		session.beginTransaction();

		// Here we have used
		// save() method of JPA
		session.save(sp1);

		session.getTransaction().commit();
	}
}
