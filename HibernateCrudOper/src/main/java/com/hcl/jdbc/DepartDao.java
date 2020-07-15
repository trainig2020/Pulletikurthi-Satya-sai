package com.hcl.jdbc;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.hibercon.HibernateCon;

public class DepartDao {
Depart dep=new Depart();

	public String createDepartment(Depart dept) {
        dep.setDeptID(dept.getDeptID());
        dep.setDeptName(dept.getDeptName());
        SessionFactory sessionFactory=HibernateCon.getSessionFactory();
        Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(dep);
		 String result="Record inserted";
		 session.getTransaction().commit();
		 session.close();
		return result;
	}

	public String updateDepartment(String deptName, int deptID) {
		dep.setDeptID(deptID);
		dep.setDeptName(deptName);
		 SessionFactory sessionFactory=HibernateCon.getSessionFactory();
	        Session session=sessionFactory.openSession();
			 session.beginTransaction();
			 session.update(dep);
			 String result="Record Updated";
			 session.getTransaction().commit();
			 session.close();
			return result;
	}

	public String deleteDepartment(int deptID) {
		dep.setDeptID(deptID);
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
        Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.delete(dep);
		 String result="Record deleted";
		 session.getTransaction().commit();
		 session.close();
		return result;
	}

	public List<Depart> getAllDepartments() {
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
        Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 
        
		 return  session.createQuery(" FROM Depart ", Depart.class).getResultList();   
	}
	}
	


