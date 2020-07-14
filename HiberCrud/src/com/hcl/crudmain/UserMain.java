package com.hcl.crudmain;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class UserMain {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 
		 
		 //User user=(User)session.get(User.class, 1);
		// user.setUserName("satyasai");
		// user.setUserName("raju ram");
		 
		 
		 Query query=session.createQuery("from User where userId>3");
		 List users=query.list();
		 
		 
//		 session.update(user);
//		 session.delete(user);
		 session.getTransaction().commit();
		 session.close();
		 System.out.println(users.size());
		 
	}

}
