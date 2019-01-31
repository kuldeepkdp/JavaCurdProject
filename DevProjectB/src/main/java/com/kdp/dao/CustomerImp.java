package com.kdp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdp.model.Customers;
import com.kdp.model.Student_Info;


public class CustomerImp {
	
	public void saveCustomerDetails(Customers c){
        	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(c);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
public List<Customers> getCustomerDetails(){
	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Customers");
		
		List<Customers> cust= (List<Customers>) query.list();
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	    cust.get(0).getCustomerName();
		
		return cust;
		
	}

	
public void deleteCustomer(int id){
	
	SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	session.createQuery("DELETE FROM Customers WHERE customerID = "+id).executeUpdate();
	
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
		
    }

public Customers getCustomer(int customerID){
	
	SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	Customers cust= session.get(Customers.class, customerID);
	
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
	
	return cust;
		
    }

public void updateCustomer(Customers c){
	
	SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	session.update(c);
	
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
	
	
		
    }
}
