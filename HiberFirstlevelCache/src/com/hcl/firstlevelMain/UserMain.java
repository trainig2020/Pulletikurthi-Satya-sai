package com.hcl.firstlevelMain;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.hcl.firstlevel.User;



public class UserMain {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 
		User user=(User) session.get(User.class, 1);
		 session.getTransaction().commit();
		 session.close();
		 
		 Session session1=sf.openSession();
		 session1.beginTransaction();
		 
		User user1=(User) session1.get(User.class, 1);
		 session1.getTransaction().commit();
		 session1.close();
		 
	}

}
