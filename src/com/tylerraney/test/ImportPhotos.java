package com.tylerraney.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tylerraney.entity.Photograph;

public class ImportPhotos {

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
			System.out.println("Creating new photo object...");
			/*
			Photograph tempPhoto = new Photograph("Party in Japan", "resources/img/800x600/DSC02744takaandjun.jpg", 
					"resources/img/thumbnails/DSC02744takaandjun.jpg", "japan,asia,people");
			Photograph tempPhoto1 = new Photograph("Kinkakuji (Golden Pavilion)", "resources/img/800x600/IMG_5740.jpg", 
					"resources/img/thumbnails/IMG_5740.jpg", "japan,asia,buildings");
			Photograph tempPhoto2 = new Photograph("Rice Paddy", "resources/img/800x600/IMG_5910.jpg", 
					"resources/img/thumbnails/IMG_5910.jpg", "japan,asia,landscape");
			Photograph tempPhoto3 = new Photograph("Itsukushima Shrine", "resources/img/800x600/IMG_6122.jpg", 
					"resources/img/thumbnails/IMG_6122.jpg", "japan,asia,buildings");
			Photograph tempPhoto4 = new Photograph("Himeji Castle", "resources/img/800x600/IMG_6279.jpg", 
					"resources/img/thumbnails/IMG_6279.jpg", "japan,asia,buildings");
			Photograph tempPhoto5 = new Photograph("K&omacr;toku-in", "resources/img/800x600/IMG_6370.jpg", 
					"resources/img/thumbnails/IMG_6370.jpg", "japan,asia,buildings,religious");
			Photograph tempPhoto6 = new Photograph("Peruvian Sand Dunes", "resources/img/800x600/IMG_1080.jpg", 
					"resources/img/thumbnails/IMG_1080.jpg", "peru,south-america,landscape");
			*/
			Photograph tempPhoto7 = new Photograph("Vicu&ntilde;a", "resources/img/800x600/IMG_1733.jpg", 
					"resources/img/thumbnails/IMG_1733.jpg", "peru,south-america,animals");
			Photograph tempPhoto8 = new Photograph("Peruvian Salt Mines", "resources/img/800x600/IMG_1918.jpg", 
					"resources/img/thumbnails/IMG_1918.jpg", "peru,south-america,landscape");
			Photograph tempPhoto9 = new Photograph("Machu Picchu", "resources/img/800x600/IMG_2039.jpg", 
					"resources/img/thumbnails/IMG_2039.jpg", "peru,south-america,landscape,buildings");
			Photograph tempPhoto10 = new Photograph("Colca Canyon Condors", "resources/img/800x600/IMG_2211.jpg", 
					"resources/img/thumbnails/IMG_2211.jpg", "peru,south-america,animals");
			Photograph tempPhoto11 = new Photograph("Vermont Countryside", "resources/img/800x600/IMG_0743.jpg", 
					"resources/img/thumbnails/IMG_0743.jpg", "vermont,north-america,usa,landscape");
			Photograph tempPhoto12 = new Photograph("Murica", "resources/img/800x600/IMG_4005.jpg", 
					"resources/img/thumbnails/IMG_4005.jpg", "new-hampshire,north-america,usa,artistic");
			Photograph tempPhoto13 = new Photograph("Holy Cow", "resources/img/800x600/IMG_3014.jpg", 
					"resources/img/thumbnails/IMG_3014.jpg", "new-hampshire,north-america,usa,animals");
			Photograph tempPhoto14 = new Photograph("Rookie", "resources/img/800x600/IMG_3198.jpg", 
					"resources/img/thumbnails/IMG_3198.jpg", "vermont,north-america,usa,animals");
			Photograph tempPhoto15 = new Photograph("Boston", "resources/img/800x600/IMG_2726.jpg", 
					"resources/img/thumbnails/IMG_2726.jpg", "boston,massachusetts,north-america,usa,cityscape");
			Photograph tempPhoto16 = new Photograph("Oh Deer", "resources/img/800x600/IMG_3482.jpg", 
					"resources/img/thumbnails/IMG_3482.jpg", "colorado,north-america,usa,animals");
			Photograph tempPhoto17 = new Photograph("La Jolla, CA Sunset", "resources/img/800x600/IMG_4428.jpg", 
					"resources/img/thumbnails/IMG_4428.jpg", "california,north-america,usa,landscape,sunset");
			Photograph tempPhoto18 = new Photograph("Gold Gate Bridge", "resources/img/800x600/IMG_5119.jpg", 
					"resources/img/thumbnails/IMG_5119.jpg", "california,north-america,usa,buildings,san-francisco");
			Photograph tempPhoto19 = new Photograph("Panther Beach. Santa Cruz, CA", "resources/img/800x600/IMG_7044.jpg", 
					"resources/img/thumbnails/IMG_7044.jpg", "california,north-america,usa,landscape");
			Photograph tempPhoto20 = new Photograph("Marin Mornings", "resources/img/800x600/IMG_6503.jpg", 
					"resources/img/thumbnails/IMG_6503.jpg", "california,north-america,usa,landscape");

			/*
				<a href="resources/img/800x600/IMG_1733.jpg" title="Vicu&ntilde;a"
					data-gallery> <img src="resources/img/thumbnails/IMG_1733.jpg"
					alt="Vicu&ntilde;a">
				</a> 
				<a href="resources/img/800x600/IMG_1918.jpg"
					title="Peruvian Salt Mines" data-gallery> <img
					src="resources/img/thumbnails/IMG_1918.jpg"
					alt="Peruvian Salt Mines">
				</a> 
				<a href="resources/img/800x600/IMG_2039.jpg" title="Machu Picchu"
					data-gallery> <img src="resources/img/thumbnails/IMG_2039.jpg"
					alt="Machu Picchu">
				</a> 
				<a href="resources/img/800x600/IMG_2211.jpg"
					title="Colca Canyon Condors" data-gallery> <img
					src="resources/img/thumbnails/IMG_2211.jpg"
					alt="Colca Canyon Condors">
				</a>
				<a href="resources/img/800x600/IMG_0743.jpg"
					title="Vermont Countryside" data-gallery> <img
					src="resources/img/thumbnails/IMG_0743.jpg"
					alt="Vermont Countryside">
				</a> 
				<a href="resources/img/800x600/IMG_4005.jpg" title="Murica"
					data-gallery> <img src="resources/img/thumbnails/IMG_4005.jpg"
					alt="Murica">
			    </a>
				<a href="resources/img/800x600/IMG_3014.jpg"
					title="Holy Cow" data-gallery> <img
					src="resources/img/thumbnails/IMG_3014.jpg"
					alt="Holy Cow">
				</a>
				<a href="resources/img/800x600/IMG_3198.jpg" title="Rookie"
					data-gallery> <img src="resources/img/thumbnails/IMG_3198.jpg"
					alt="Rookie">
			    </a> 
			    <a href="resources/img/800x600/IMG_2726.jpg" title="Boston"
					data-gallery> <img src="resources/img/thumbnails/IMG_2726.jpg"
					alt="Boston">
			    </a> 
			    <a href="resources/img/800x600/IMG_3482.jpg" title="Oh Deer"
					data-gallery> <img src="resources/img/thumbnails/IMG_3482.jpg"
					alt="Oh Deer"> 
				</a>
			    <a href="resources/img/800x600/IMG_4428.jpg" title="La Jolla, CA Sunset"
					data-gallery> <img src="resources/img/thumbnails/IMG_4428.jpg"
					alt="La Jolla, CA Sunset"> 
				</a>
				<a href="resources/img/800x600/IMG_5119.jpg" title="Gold Gate Bridge"
					data-gallery> <img src="resources/img/thumbnails/IMG_5119.jpg"
					alt="Golden Gate Bridge">
			    </a> 
			    <a href="resources/img/800x600/IMG_7044.jpg" title="Panther Beach. Santa Cruz, CA"
					data-gallery> <img src="resources/img/thumbnails/IMG_7044.jpg"
					alt="Panther Beach. Santa Cruz, CA"> 
				</a>
			    <a href="resources/img/800x600/IMG_6503.jpg" title="Marin Mornings"
					data-gallery> <img src="resources/img/thumbnails/IMG_6503.jpg"
					alt="Marin Mornings"> 
				</a>
				*/
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the photos ...");
//			session.save(tempPhoto);
//			session.save(tempPhoto1);
//			session.save(tempPhoto2);
//			session.save(tempPhoto3);
//			session.save(tempPhoto4);
//			session.save(tempPhoto5);
//			session.save(tempPhoto6);
			session.save(tempPhoto7);
			session.save(tempPhoto8);
			session.save(tempPhoto9);
			session.save(tempPhoto10);
			session.save(tempPhoto11);
			session.save(tempPhoto12);
			session.save(tempPhoto13);
			session.save(tempPhoto14);
			session.save(tempPhoto15);
			session.save(tempPhoto16);
			session.save(tempPhoto17);
			session.save(tempPhoto18);
			session.save(tempPhoto19);
			session.save(tempPhoto20);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

}
