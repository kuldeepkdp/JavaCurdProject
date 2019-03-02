package com.kdp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdp.model.Riders;
import com.kdp.model.RouteAndFare;

public class RiderImp {
	
public void saveRiderDetails(Riders r){
    	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(r);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
}
