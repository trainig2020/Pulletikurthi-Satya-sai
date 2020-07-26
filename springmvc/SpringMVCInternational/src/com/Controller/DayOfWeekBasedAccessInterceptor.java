package com.Controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws	Exception {
		Calendar calendar=Calendar.getInstance();
		 int dayofweek=calendar.get(calendar.DAY_OF_WEEK);
		 
		 
		 if(dayofweek==1){
			 response.getWriter().write("This website is closed on sunday"+"try accesing is on week days");
			 return false;
			 
		 }else
		
		return true;
		
	}
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler,ModelAndView modelAndView) throws	Exception {
		System.out.println("post handling "+request.getRequestURI().toString());
	}
	
	
}
