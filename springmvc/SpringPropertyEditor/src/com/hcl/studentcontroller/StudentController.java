package com.hcl.studentcontroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController  {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView modelAndView=new ModelAndView("AdmissionForm");

		return modelAndView;
	}
	@InitBinder
	public void  initBinder(WebDataBinder binder){
//		binder.setAllowedFields(new String[]{"studentMobile"});
		binder.setDisallowedFields(new String[]{"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy*mm*dd");
		binder.registerCustomEditor(Date.class,"studentDob",new CustomDateEditor(dateFormat,false));
	}

	@ModelAttribute
	public void common(Model model){
		model.addAttribute("head", "sathyabama University");
		
	}
	
	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student) {
		/*Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);*/
		
		ModelAndView modelAndView=new ModelAndView("AdmissionSucces");
//		modelAndView.addObject("head","sathyabama university");
		return modelAndView;
	}

}
