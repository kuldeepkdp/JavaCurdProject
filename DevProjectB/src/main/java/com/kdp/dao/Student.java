package com.kdp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdp.model.Student_Info;
import com.kdp.model.Users;


public class Student {
	
	
	public static void saveStudentInfo(){
		
		Student_Info info= new Student_Info();
		
		info.setName("Kuldeep");
		info.setRollNo(111);
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(info);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
public static void saveStudentInfo2(String name, int rollNo){
		
		Student_Info info= new Student_Info();
		
		info.setName(name);
		info.setRollNo(rollNo);
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(info);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}


public static boolean saveUserInfo(){
		
	SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	String id="kuldeepkdp";
	String password="Password1";
	
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
