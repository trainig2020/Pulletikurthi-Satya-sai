package com.hcl.servletdemo;

import java.util.List;

import org.hibernate.SQLQuery;

public class DepartService {
	public static String createDepartment(Depart dept) { 
	    return new DepartDao().createDepartment(dept);
	  }
	public static String updateDepartment(String deptName, int deptID) { 
	    return new DepartDao().updateDepartment(deptName, deptID);
	  }
	public static String deleteDepartment(int deptID) { 
	    return new DepartDao().deleteDepartment(deptID);
	  }
//	public static SQLQuery getAllDepartments() {
//		return new DepartDao().getAllDepartments();
//	}
}
