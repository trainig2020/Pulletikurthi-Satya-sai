package com.hcl.hellocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/user")
public class HelloController  {

	@RequestMapping("/welcome")
	protected ModelAndView helloworld() {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "hi world");
		
		return modelAndView;
	}
	@RequestMapping("/satya")
	protected ModelAndView haiworld() {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "hi satya sai");
		
		return modelAndView;
	}

}