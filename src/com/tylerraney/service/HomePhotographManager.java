package com.tylerraney.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tylerraney.entity.Photograph;

public class HomePhotographManager implements PhotographManager, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1916993878028188144L;
	
	private SessionFactory m_factory;
	private Session m_session;
	
	/**
	 * Return all unique tags
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getUniqueTags() {
		createSession();
		
		List<String> tags = new ArrayList<>();
		List<Photograph> thePhotos = null;

		try {
//			System.out.println("Quering photo objects...");

			// start a transaction
			m_session.beginTransaction();
			thePhotos = m_session.createQuery("from Photograph").getResultList();
			String[] tempTags = null;
			for (Photograph tempPhoto : thePhotos) {
				tempTags = tempPhoto.getTags().split(",");
				
				if (tempTags != null)
				{
					for (String tag : tempTags)
					{
						if (!tags.contains(tag.toLowerCase()))
						{
							tags.add(tag);
						}
					}	
				}
			}

			Collections.sort(tags);
			
			// commit transaction
			m_session.getTransaction().commit();

//			System.out.println("Done!");
		}
		finally {
			m_factory.close();
		}

		return tags.toString().replace("[", "").replace("]", "").toLowerCase();
	}

	/**
	 * Returns the photographs with the specified tags
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Photograph> getPhotographs(String[] tags) {
		
		createSession();
		
		List<Photograph> thePhotos = null;

		try {
//			System.out.println("Quering photo objects...");

			// start a transaction
			m_session.beginTransaction();

			StringBuilder query = new StringBuilder();
			if (tags == null || tags.length == 0)
			{
				query.append("from Photograph p");
			}
			else
			{
				query.append("from Photograph p where");
				for (int i = 0; i < tags.length; i++)
				{
					if (i > 0)
					{
						query.append(" and ");
					}
					query.append(" p.tags LIKE '%" + tags[i] + "%'");
				}
			}
			thePhotos = m_session.createQuery(query.toString()).getResultList();
			
//			for (Photograph tempPhoto : thePhotos) {
//				System.out.println(tempPhoto);
//			}

			// commit transaction
			m_session.getTransaction().commit();

//			System.out.println("Done!");
		}
		finally {
			m_factory.close();
		}

		return thePhotos;
	}
	
	/**
	 * Initialize session and factory. Must close factory in each method.
	 */
    private void createSession()
    {
		// create session factory
		m_factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Photograph.class)
				.buildSessionFactory();

		// create session
		m_session = m_factory.getCurrentSession();
    }

}
