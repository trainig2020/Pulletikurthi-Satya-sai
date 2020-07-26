package com.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestfulController {
	
	@RequestMapping(value="/students",method=RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> getStudentList(){
		Student student1=new Student();
		student1.setStudentName("Satya sai");
		Student student2=new Student();
		student2.setStudentName("rama raju");
		Student student3=new Student();
		student3.setStudentName("Sai Krishna");
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		return arrayList;
		
	}
	@RequestMapping(value="/students/{name}",method=RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public  Student getStudent(@PathVariable("name") String studentName){
		Student student=new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("Cricket");
		return student;
		
	}
	@RequestMapping(value="/students/{name}",method=RequestMethod.PUT,consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public  boolean updateStudent(@PathVariable("name") String studentName,@RequestBody Student student){
		System.out.println("studentName"+studentName);
		System.out.println("studentName"+student.getStudentName()+"studentHobby"+student.getStudentHobby());
		return true;
		
	}
}
