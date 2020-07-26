package com.Controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {



	 @Override

	   public void initialize(IsValidHobby isValidHobby) {



	   }



	 @Override

	 public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {

	 if(studentHobby==null){

	  return false;

	 }

	 else if(studentHobby.matches("Music|Dance|Sports")){

	  return true;

	 }

	 else{

	  return false;

	 }



	 }



	}

