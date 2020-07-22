package com.hcl.springdemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
 public static void main(String[] args) {
	 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	 SpringDao dao=applicationContext.getBean("springDao",SpringDao.class);
	 
Circle circle=dao.getAllCircles(1);
System.out.println(circle.getName());
	
}
}
