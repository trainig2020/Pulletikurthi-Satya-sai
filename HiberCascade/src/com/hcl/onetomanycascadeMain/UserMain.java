package com.hcl.onetomanycascadeMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.onetomanycascade.User;
import com.hcl.onetomanycascade.Vehical;

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
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 session.persist(user);
		 
		 
		 session.getTransaction().commit();
		 session.close();
		 
	}

}
