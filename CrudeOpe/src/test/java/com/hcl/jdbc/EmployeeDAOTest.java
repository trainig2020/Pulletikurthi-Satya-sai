package com.hcl.jdbc;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

//	@Test
//	public void testCreateEmployee() {
//		Employee emp=new Employee();
//		emp.setEmpID(3);
//		emp.setEmpName("lakshmi");
//		emp.setDID(9);
//		assertEquals("Employees Details Added", EmployeeSer.createEmployee(emp));
//	}
//
//	@Test
//	public void testUpdateEmployee() {
//		assertEquals("Employee details updated", EmployeeSer.updateEmployee(10,2, "sailakshmi"));
//	}
//
//	@Test
//	public void testDeleteEmployee() {
//		assertEquals("Employee Deleted succesfully", EmployeeSer.deleteEmployee(1, 8));
//	}

	@Test
	public void testGetAllEmployees() {
		Department dep=new Department();
		dep.setDeptID(3);
		assertNotNull(dep);
	}

}
