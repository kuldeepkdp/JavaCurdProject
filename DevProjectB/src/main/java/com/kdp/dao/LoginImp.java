package com.kdp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdp.model.Users;

public class LoginImp {
	
	
	
	public boolean isValid(String id, String password){
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	    Query query= session.createQuery("from Users where userId = ? and password = ? ");
	    query.setString(0, id);
	    query.setString(1, password);
	    
	    List<Users> ulist= (List<Users>) query.list();
	    
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	    
		  if (ulist.size()==1){
			  
			  return true;
		  }
			
		  
		  else {
			  return false;
		  }
		
		
	}

}
