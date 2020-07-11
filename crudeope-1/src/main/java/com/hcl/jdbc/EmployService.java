package com.hcl.jdbc;

import java.util.List;

public class EmployService {
    public static String createEmployee(Employ emp) {
    	return new EmployDao().createEmployee(emp);
    }
    public static String updateEmployee(int dId,int empID, String empName) {
    	return new EmployDao().updateEmployee(dId,empID,empName);
    }
    public static String deleteEmployee(int dId,int empID ) {
    	return new EmployDao().deleteEmployee(dId,empID);
    }
    public static List<Employ> getAllEmployees(int dId){
    	return new EmployDao().getAllEmployees(dId);
    }
}
