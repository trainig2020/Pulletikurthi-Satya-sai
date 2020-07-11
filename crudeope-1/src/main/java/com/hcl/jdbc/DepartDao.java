package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartDao {
	Connection con;
	PreparedStatement pst;
	public String createDepartment(Depart dept) {
		con = DaoCon.getConnection();
		String cmd= "insert into Depart(deptID,deptName) values(?,?)";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, dept.getDeptID());
			pst.setString(2, dept.getDeptName());
			pst.executeUpdate();
			result = "Department Added Succesfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String updateDepartment(String deptName, int deptID) {
		 con=DaoCon.getConnection();
		 String cmd="Update Depart set deptName=? where deptID=?";
		 String result= "";
		 try {
			pst =con.prepareStatement(cmd);
			pst.setString(1, deptName);
			pst.setInt(2, deptID);
			pst.executeUpdate();
			result = "Department Updated";
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}

	public String deleteDepartment(int deptID) {
		con = DaoCon.getConnection();
		String cmd = "delete from Depart where deptID=?";
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, deptID);
			pst.executeUpdate();
			result = "Department deleted Succesfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Depart> getAllDepartments() {
		con = DaoCon.getConnection();
		String cmd = "select * from Depart";
		Depart d = null;
		List<Depart> lst =new ArrayList<Depart>();
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			    d =new Depart();
			    d.setDeptID(rs.getInt("deptID"));
			    d.setDeptName(rs.getString("deptName"));
			    lst.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
