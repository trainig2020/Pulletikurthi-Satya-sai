package com.Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat,false));
	    binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception{
//		String exceptionOccured="NULL_POINTER";
		String exceptionOccured="ArthmeticException";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			throw new NullPointerException();
			
		}else if(exceptionOccured.equalsIgnoreCase("ArthmeticException")){
			throw new ArithmeticException();
		}
		ModelAndView model1=new ModelAndView("AdmissionForm");
		
		return model1;
	}
	
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
	model1.addAttribute("headerMessage","sathyabama University,india");
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1")Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1=new ModelAndView("AdmissionForm");
			return model1;
		}else {
		ModelAndView model1=new ModelAndView("AdmissionSuccess");
		
		return model1;

}
	}
@ResponseBody
@RequestMapping(value="/students",method=RequestMethod.GET)
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
}