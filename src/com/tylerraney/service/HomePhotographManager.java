package com.tylerraney.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tylerraney.entity.Photograph;
import com.tylerraney.entity.Tag;

public class HomePhotographManager implements PhotographManager, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1916993878028188144L;
	
	private SessionFactory m_factory;
	private Session m_session;
	
	/**
	 * Initialize session and factory. Must close factory in each method.
	 */
	private void createSession()
	{
		m_factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Photograph.class)
				.addAnnotatedClass(Tag.class)
				.buildSessionFactory();  
	
		// create session
		m_session = m_factory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Photograph> getAllPhotographs() {
		createSession();
		
		List<Photograph> photos = new ArrayList<Photograph>();
		
		try {
			// start a transaction
			m_session.beginTransaction();
			photos.addAll(m_session.createQuery("from Photograph p order by p.title").getResultList());
			
			// commit transaction
			m_session.getTransaction().commit();
		}
		finally {
			m_factory.close();
		}
		
		return photos;
	}

	/**
	 * Returns the photographs with the specified tags
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Photograph> getPhotographsByTags(String[] tags) {
		createSession();
	
		List<Tag> tagSet = new ArrayList<Tag>();
		List<Photograph> thePhotos = new ArrayList<Photograph>();
		
		try{
			// start a transaction
			m_session.beginTransaction();
	
			StringBuilder query = new StringBuilder();
			if (tags == null || tags.length == 0)
			{
				query.append("from Tag t");
			}
			else
			{
				query.append("from Tag t where");
				for (int i = 0; i < tags.length; i++)
				{
					if (i > 0)
					{
						query.append(" or ");
					}
					query.append(" t.name='" + tags[i] + "'");
				}
			}
			query.append(" order by t.name");
			tagSet.addAll(m_session.createQuery(query.toString()).getResultList());
			
			for (Tag t : tagSet) {
				if (thePhotos.isEmpty()){
					thePhotos.addAll(t.getPhotographs());					
				} else {
					thePhotos.retainAll(t.getPhotographs());
				}
			}
			
			// commit transaction
			m_session.getTransaction().commit();
		}
		finally {
			m_factory.close();
		}
		
		return thePhotos;
	}

	/**
	 * Return all unique tags
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Tag> getUniqueTags() {
		createSession();

		List<Tag> tags = new ArrayList<Tag>();

		try {
			// start a transaction
			m_session.beginTransaction();
			tags.addAll(m_session.createQuery("from Tag t order by t.name").getResultList());

			// commit transaction
			m_session.getTransaction().commit();
		}
		finally {
			m_factory.close();
		}

		return tags;
	}
	
	@Override
	public String getUniqueTagsAsString() {	
		StringBuilder result = new StringBuilder();
		
		for (Tag t : getUniqueTags()){
			result.append(t.getName());
			result.append(",");
		}
		
		return result.toString();
	}	

}
