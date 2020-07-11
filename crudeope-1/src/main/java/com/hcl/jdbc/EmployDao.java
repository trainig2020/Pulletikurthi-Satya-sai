package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDao {
	Connection con;
	PreparedStatement pst;
	public String createEmployee(Employ emp) {
		con = DaoCon.getConnection();
		String cmd = "insert into Employ (empID,empName,dId) values(?,?,?)";
		String result = "";
		try {
			pst =con.prepareStatement(cmd);
			pst.setInt(1, emp.getEmpID());
			pst.setString(2, emp.getEmpName());
			pst.setInt(3, emp.getdId());
			pst.executeUpdate();
			result ="Employees Details Added";
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	public String updateEmployee(int dId,int empID, String empName) {
		 con = DaoCon.getConnection();
		 String cmd = "update Employ set empName=? where dId=? and empID=?";
		 String result = "";
		 try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, empName);
			pst.setInt(2, dId);
			pst.setInt(3, empID);
			pst.executeUpdate();
			result = "Employee details updated";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public String deleteEmployee(int dId,int empID) {
		con = DaoCon.getConnection();
		String cmd = "delete from Employ where dId=? and empID=? ";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, dId);
			pst.setInt(2, empID);
			pst.executeUpdate();
			result="Employee Deleted succesfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Employ> getAllEmployees(int dId) {
		con = DaoCon.getConnection();
		String cmd = "select * from Employ where dId=?";
		List<Employ> lst = new ArrayList<Employ>();
		try {
			pst = con.prepareStatement(cmd);
			System.out.println(dId);
			pst.setInt(1, dId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employ emp = new Employ(rs.getInt("empID"),rs.getString("empName"),rs.getInt("dId"));
				lst.add(emp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lst;
	}
   
}
