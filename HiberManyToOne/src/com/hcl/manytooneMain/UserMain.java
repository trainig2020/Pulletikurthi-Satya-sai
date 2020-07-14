package com.hcl.manytooneMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.manytoone.User;
import com.hcl.manytoone.Vehical;

public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		user.setUserName("satya");
		
		
		Vehical vehical=new Vehical();
		vehical.setVehicalName("car");
		user.getVehical().add(vehical);
		
		Vehical vehical1=new Vehical();
		vehical1.setVehicalName("jeep");
		user.getVehical().add(vehical1);
		
		vehical.setUser(user);
		vehical1.setUser(user);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 session.save(user);
		 session.save(vehical);
		 session.save(vehical1);
		 
		 session.getTransaction().commit();
		 session.close();
		 
	}

}
