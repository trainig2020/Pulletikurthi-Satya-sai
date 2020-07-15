package com.hcl.jdbc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Depart {
	@Id
	private int deptID;
	private String deptName;
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Depart(int deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Depart [deptID=" + deptID + ", deptName=" + deptName + "]";
	}
	public Depart() {
		super();
	}
	

	
}
