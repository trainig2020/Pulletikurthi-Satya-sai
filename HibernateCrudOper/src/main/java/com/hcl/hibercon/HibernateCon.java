package com.hcl.hibercon;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCon {

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
		
		
	}
}
