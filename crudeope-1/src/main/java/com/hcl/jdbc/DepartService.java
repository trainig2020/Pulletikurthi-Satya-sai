package com.hcl.jdbc;

import java.util.List;

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
	public static List<Depart> getAllDepartments() {
		return new DepartDao().getAllDepartments();
	}
}
