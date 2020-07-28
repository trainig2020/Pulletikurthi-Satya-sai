package com.hcl.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table
public class Department {
	@Id
	private int DeptID;
	@Size(min=3,max=20)
	private String DeptName;

	public int getDeptID() {
		return DeptID;
	}

	public void setDeptID(int deptID) {
		DeptID = deptID;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [DeptID=" + DeptID + ", DeptName=" + DeptName + "]";
	}

	public Department(int deptID, String deptName) {
		super();
		DeptID = deptID;
		DeptName = deptName;
	}

	public Department() {
		super();
	}

}
