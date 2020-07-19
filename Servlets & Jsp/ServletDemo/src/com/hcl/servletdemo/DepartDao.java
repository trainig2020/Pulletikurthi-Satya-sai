package com.hcl.servletdemo;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.conn.ConnectionDemo;

public class DepartDao {
Depart dep=new Depart();

	public String createDepartment(Depart dept) {
        dep.setDeptID(dept.getDeptID());
        dep.setDeptName(dept.getDeptName());
        SessionFactory sessionFactory=ConnectionDemo.getSessionFactory();
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
		 SessionFactory sessionFactory=ConnectionDemo.getSessionFactory();
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
		SessionFactory sessionFactory=ConnectionDemo.getSessionFactory();
        Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.delete(dep);
		 String result="Record deleted";
		 session.getTransaction().commit();
		 session.close();
		return result;
	}

//	public SQLQuery getAllDepartments() {
//		SessionFactory sessionFactory=ConnectionDemo.getSessionFactory();
//        Session session=sessionFactory.openSession();
//		 session.beginTransaction();
//		 
//        
//		 return  session.createSQLQuery(" FROM Depart ");   
//	}
	}
	


