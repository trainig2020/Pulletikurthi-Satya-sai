package com.hcl.onetomany;

import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@OneToMany
	private Collection<Vehical> vehical=new ArrayList<Vehical>();
	
	
	public Collection<Vehical> getVehical() {
		return vehical;
	}
	public void setVehical(Collection<Vehical> vehical) {
		this.vehical = vehical;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
