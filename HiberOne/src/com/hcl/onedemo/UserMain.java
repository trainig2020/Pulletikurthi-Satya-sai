package com.hcl.onedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.onetoone.User;
import com.hcl.onetoone.Vehical;

public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		user.setUserName("satya");
		
		
		Vehical vehical=new Vehical();
		vehical.setVehicalName("car");
		user.setVehical(vehical);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 session.save(user);
		 session.save(vehical);
		 session.getTransaction().commit();
		 session.close();
		 
	}

}
