package com.hcl.studentcontroller;

import org.springframework.stereotype.Controller;
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

	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			                       @RequestParam("studentHobby") String hobby) {
		Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		
		ModelAndView modelAndView=new ModelAndView("AdmissionSucces");
		modelAndView.addObject("head","sathyabama university");
        modelAndView.addObject("student",student);
		return modelAndView;
	}

}
