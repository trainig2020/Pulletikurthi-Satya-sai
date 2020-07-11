package com.hcl.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartMain {

	public static void main(String[] args) {
		int deptID;
		String deptName;
		Depart d = new Depart();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deptID:");
		d.setDeptID(Integer.parseInt(sc.nextLine()));
		System.out.println("Eneter the deptName :");
		d.setDeptName(sc.nextLine());
		System.out.println(DepartService.createDepartment(d));

		System.out.println("************************************************");

		System.out.println("Enter deptName :");
		deptName = sc.nextLine();
		System.out.println("Enter deptID :");
		deptID = Integer.parseInt(sc.nextLine());
		System.out.println(DepartService.updateDepartment(deptName, deptID));

		System.out.println("---************************************************-----");

		System.out.println(DepartService.getAllDepartments());

		System.out.println("----************************************************------");

		System.out.println("Enter DeptID :");
		deptID = Integer.parseInt(sc.nextLine());
		System.out.println(DepartService.deleteDepartment(deptID));

		System.out.println("--************************************************-----");
		int dId;
		int empID ;
        String empName;
		Employ e = new Employ();
		System.out.println("Enter the Employee deptID:");
		e.setdId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the empID:");
		e.setEmpID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the empName");
		e.setEmpName(sc.nextLine());
		System.out.println(EmployService.createEmployee(e));

		System.out.println("-************************************************--");

		
		System.out.println("Enter the Employee deptID:");
		dId = Integer.parseInt(sc.nextLine());
		
    	System.out.println("Enter the empID:");
    	empID = Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter the empName:");
    	empName = sc.nextLine();
		System.out.println(EmployService.updateEmployee(dId, empID, empName));

		System.out.println("--************************************************--");

		
		System.out.println("Enter DepartmentID: ");
		dId = sc.nextInt();
		List<Employ> lst = new ArrayList<Employ>();
		lst = EmployService.getAllEmployees(dId);
		for (Employ employ : lst) {
			System.out.println(employ.getEmpID());
			System.out.println(employ.getEmpName());
		}

		System.out.println("----************************************-------");

		System.out.println("Enter DID:");
		dId = (sc.nextInt());
		System.out.println("Enter EmpID");
		int empID1 = sc.nextInt();
		System.out.println(EmployService.deleteEmployee(dId, empID1));
		System.out.println("Delete Of Employee Is Succesfull");
        System.out.println("----$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-----");

}
}
