package com.hcl.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
}