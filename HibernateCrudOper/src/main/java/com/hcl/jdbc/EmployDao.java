package com.hcl.jdbc;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.hibercon.HibernateCon;

public class EmployDao {
 Employ empy=new Employ();
 
	public String createEmployee(Employ emp) {
		empy.setEmpID(emp.getEmpID());
		empy.setEmpName(emp.getEmpName());
		empy.setdId(emp.getdId());
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
        Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(empy);
		 String result="Employee Record inserted";
		 session.getTransaction().commit();
		 session.close();
		return result;
	}

	public String updateEmployee(int dId, int empID, String empName) {
		empy.setEmpID(empID);
		empy.setEmpName(empName);
		empy.setdId(dId);
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
		Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.update(empy);
		 String result="Employee Record Updated";
		 session.getTransaction().commit();
		 session.close();
		return result;

	}

	public String deleteEmployee(int dId, int empID) {
		empy.setdId(dId);
		empy.setEmpID(empID);
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
		Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 session.delete(empy);
		 String result="Employee Record Deleted";
		 session.getTransaction().commit();
		 session.close();
		return result;
	}

	public List<Employ> getAllEmployees(int dId) {
		
		SessionFactory sessionFactory=HibernateCon.getSessionFactory();
		Session session=sessionFactory.openSession();
		 session.beginTransaction();
		SQLQuery query= session.createSQLQuery("select * FROM Employ where dId=:deptID ");
		query.addEntity(Employ.class);
		query.setParameter("deptID", dId);
		List Employ=query.list();
		session.getTransaction().commit();
		 session.close();
		return Employ;
	}
	
   
}
