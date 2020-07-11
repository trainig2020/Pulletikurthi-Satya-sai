package com.hcl.jdbc;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sun.tracing.dtrace.DependencyClass;

public class DepartmentDAOTest {

	@Test
	public void testCreateDepartment() {
		Department dep=new Department();
		dep.setDeptID(32);
		dep.setDeptName("Satya");
		assertEquals("Department Added Succesfully", DepartmentSer.createDepartment(dep));
	}

	@Test
	public void testUpdateDepartment() {
		assertEquals("Department Updated", DepartmentSer.updateDepartment("sai",32));
	}

	@Test
	public void testDeleteDepartment() {
		
		assertEquals("Department deleted Succesfully",DepartmentSer.deleteDepartment(32));
	}

	@Test
	public void testGetAllDepartments() {
		List<Department> lst =DepartmentSer.getAllDepartments();
		assertNotNull(lst);
		
	}

}
