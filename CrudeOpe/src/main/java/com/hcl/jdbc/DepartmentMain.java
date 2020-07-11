package com.hcl.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentMain {

	public static void main(String[] args) {
		int DeptID;
		String DeptName;
		Department d = new Department();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the DeptID:");
		d.setDeptID(Integer.parseInt(sc.nextLine()));
		System.out.println("Eneter the DeptName :");
		d.setDeptName(sc.nextLine());
		System.out.println(DepartmentSer.createDepartment(d));

		System.out.println("************************************************");

		System.out.println("Enter DeptName :");
		DeptName = sc.nextLine();
		System.out.println("Enter DeptID :");
		DeptID = Integer.parseInt(sc.nextLine());
		System.out.println(DepartmentSer.updateDepartment(DeptName, DeptID));

		System.out.println("---************************************************-----");

		System.out.println(DepartmentSer.getAllDepartments());

		System.out.println("----************************************************------");

//		System.out.println("Enter DeptID :");
//		DeptID = Integer.parseInt(sc.nextLine());
//		System.out.println(DepartmentSer.deleteDepartment(DeptID));
//
//		System.out.println("--************************************************-----");
//
		Employee e = new Employee();
		System.out.println("Enter the Employee deptid:");
		e.setDID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp ID:");
		e.setEmpID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp Name");
		e.setEmpName(sc.nextLine());
		System.out.println(EmployeeSer.createEmployee(e));

		System.out.println("-************************************************--");
//
		System.out.println("Enter the DepartmentID:");
		int diD = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Emplyee ID:");
		int empID = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Employee Name:");
		String empName = sc.nextLine();

		System.out.println(EmployeeSer.updateEmployee(diD, empID, empName));

		System.out.println("--************************************************--");

		int DID;
		System.out.println("Enter DepartmentID: ");
		DID = sc.nextInt();
		List<Employee> lst = new ArrayList<Employee>();
		lst = EmployeeSer.getAllEmployees(DID);
		for (Employee employee : lst) {
			System.out.println(employee.getEmpID());
			System.out.println(employee.getEmpName());
		}

		System.out.println("----************************************-------");

		System.out.println("Enter DID:");
		DID = (sc.nextInt());
		System.out.println("Enter EmpID");
		int EmpID = sc.nextInt();
		System.out.println(EmployeeSer.deleteEmployee(DID, EmpID));
		System.out.println("Delete Of Employee Is Succesfull");
        System.out.println("----$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-----");

	}
}
