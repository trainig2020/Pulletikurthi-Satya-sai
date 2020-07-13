package com.hcl.hiber;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.hibernate.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e= new Employee();
		//Employee e2= new Employee();
		
		Address address=new Address();
		e.setEmpName("satyasai");
		e.setDate(new Date());
//		e.setHome(address);
		address.setCity("valluru");
		address.setState("Ap");
		address.setStreet("shivalyam2");
		e.getListAddress().add(address);
		
		Address address1=new Address();
//		e.setOffice(address1);
		address1.setCity("rajamundry");
		address1.setState("Ap");
		address1.setStreet("ramnagar5");
		e.getListAddress().add(address1);
		
//		e2.setEmpName("third");
//		e2.setDate(new Date());
 SessionFactory sf=new Configuration().configure().buildSessionFactory();
 Session session=sf.openSession();
 session.beginTransaction();
 session.save(e);
 
// session.save(e2);
 session.getTransaction().commit();
 session.close();
 
 e=null;
 
 session=sf.openSession();
// session.beginTransaction();
 e=(Employee)session.get(Employee.class, 2);
 session.close();
 System.out.println(e.getListAddress().size()+"::::"+e.getEmpName());

	}

}
