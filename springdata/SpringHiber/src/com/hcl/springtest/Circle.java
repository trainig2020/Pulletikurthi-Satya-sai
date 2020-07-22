package com.hcl.springtest;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Circle {
	@Id
	private int ID;
	private String Name;
	
	public Circle(int iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
