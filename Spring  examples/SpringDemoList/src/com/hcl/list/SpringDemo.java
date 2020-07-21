package com.hcl.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo {

	public static void main(String[] args) {
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
