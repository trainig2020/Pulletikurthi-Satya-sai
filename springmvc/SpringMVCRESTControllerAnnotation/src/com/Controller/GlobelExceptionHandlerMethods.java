package com.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobelExceptionHandlerMethods {
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e){
		System.out.println("Null pointer Exception occured"+e);
		return "NullPointerException";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleUnknownException(Exception e){
		System.out.println("Unknown Exception occured"+e);
		return "Exception";
	}
}
