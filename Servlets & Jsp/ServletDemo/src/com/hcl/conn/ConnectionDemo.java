package com.hcl.conn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDemo {

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
		
		
	}
}
