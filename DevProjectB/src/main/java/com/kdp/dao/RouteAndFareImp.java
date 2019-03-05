package com.kdp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdp.model.Riders;
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
	public List<RouteAndFare> getRouteAndFareDetails(){
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from RouteAndFare");
		
		List<RouteAndFare> route= (List<RouteAndFare>) query.list();
		
		for(RouteAndFare a : route) {

			System.out.println("pickup city-------" + a.getPickupCity());

			System.out.println("destination city-------" + a.getDestinationCity());

			System.out.println("innova price-------" + a.getInnovaFare());

			System.out.println("suv price-------" + a.getSuvFare());

			System.out.println("swift price------" + a.getSwiftFare());

		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		return route;
}
	
	public void deleteRouteAndFare(int routeAndFareID){
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.createQuery("DELETE FROM RouteAndFare WHERE routeAndFareID = "+routeAndFareID).executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
			
	    }
	
	public RouteAndFare getRouteAndFare(int routeAndFareID){
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		RouteAndFare cab= session.get(RouteAndFare.class, routeAndFareID);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		return cab;
			
	    }

	public void updateRouteAndFare(RouteAndFare c){
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(c);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
			
	    }

}
