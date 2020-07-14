package com.hcl.inheritanceMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.inheritance.FourWheeler;
import com.hcl.inheritance.TwoWheeler;
import com.hcl.inheritance.Vehical;

public class UserMain {

	public static void main(String[] args) {
		
		
		
		Vehical vehical=new Vehical();
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicalName("glamour");
		bike.setHandle("steering Handle");
		
		
		FourWheeler car=new FourWheeler();
		car.setVehicalName("Porsch");
		car.setWheel("steering Wheel");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 session.save(vehical);
		 session.save(bike);
		 session.save(car);
		 
		 session.getTransaction().commit();
		 session.close();
		 
	}

}
