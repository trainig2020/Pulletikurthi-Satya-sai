package com.hcl.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController  {

	@RequestMapping("/welcome/{country}/{userName}")
	protected ModelAndView helloworld(@PathVariable Map<String,String> getmap) {
		String name=getmap.get("userName");
		String country=getmap.get("country");
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "hi world"+name+"your country is"+country);
		
		return modelAndView;
	}
	

}
