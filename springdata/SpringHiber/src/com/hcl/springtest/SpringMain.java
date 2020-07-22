package com.hcl.springtest;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
 public static void main(String[] args) {
	 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	 HibernateDao dao=(HibernateDao) applicationContext.getBean("hibernateDao");
	 

//System.out.println(dao.getCircleName(1));
//System.out.println(dao.GetCircleId(2).getName());
//dao.inserCircle (new Circle(5,"fifth circle"));
System.out.println(dao.getCircleCount());
	
}
}
