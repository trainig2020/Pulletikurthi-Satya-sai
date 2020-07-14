package com.hcl.pagemain;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hcl.page.User;



public class UserMain {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 
		 
		 
		 Query query=session.createQuery("select userName from User");
		 query.setFirstResult(2);
		 query.setMaxResults(3);
		 List<String> users=(List<String>)query.list();
		 
		 		 
		 session.getTransaction().commit();
		 session.close();
		 for (String u : users) {
			 System.out.println(u);
		}
		 
		 
	}

}
