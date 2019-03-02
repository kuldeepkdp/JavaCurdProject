package com.kdp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.kdp.model.RouteAndFare;
import com.kdp.model.Users;

public class RouteAndFareImp {
	
	public void saveRouteAndFare(RouteAndFare r){
    	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(r);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
	public List<RouteAndFare> getFare(String pickupCity, String destinationCity) {
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	    Query query= session.createQuery("from RouteAndFare where pickupCity = ? and destinationCity = ? ");
	    query.setString(0, pickupCity);
	    query.setString(1, destinationCity);
	    
	    List<RouteAndFare> fareList = (List<RouteAndFare>) query.list();
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		return fareList;
		
		
	}

}
