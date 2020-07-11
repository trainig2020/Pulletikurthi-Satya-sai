package com.hcl.jdbc;

public class Employ {
	private int empID;
	private String empName;
	private int dId;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	@Override
	public String toString() {
		return "Employ [empID=" + empID + ", empName=" + empName + ", dId=" + dId + "]";
	}
	public Employ(int empID, String empName, int dId) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.dId = dId;
	}
	public Employ() {
		super();
	}

	

}
