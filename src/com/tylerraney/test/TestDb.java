package com.tylerraney.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tylerraney.entity.Photograph;

public class TestDb {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Photograph.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
//			System.out.println("Creating new photo object...");
			//String[] tags = {"Person", "Boston", "Landscape"};
			//Photograph tempPhoto = new Photograph("Boy", "local", "local/thumb", tags);

			// start a transaction
			session.beginTransaction();
			
			@SuppressWarnings("unchecked")
			List<Photograph> theStudents = session.createQuery("from Photograph").getResultList();
			
//			for (Photograph tempStudent : theStudents) {
//				System.out.println(tempStudent);
//			}

			// save the student object
			//System.out.println("Saving the photo ...");
			//session.save(tempPhoto);

			// commit transaction
			session.getTransaction().commit();

//			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

}
