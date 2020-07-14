package com.hcl.namedqueryMain;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.hcl.namedquery.User;



public class UserMain {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 
		 Criteria criteria=session.createCriteria(User.class);
		 criteria.add(Restrictions.eq("sai", "ram"));
		 
		 
		 
		
		 
		 List<User> users=(List<User>)criteria.list();
		 session.getTransaction().commit();
		 session.close();
		 for (User user : users) {
			System.out.println(user.getUserName());
		}
		 
	}

}
