package com.hcl.springdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringDao {
	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	Connection con=null;
	PreparedStatement pst;
	
	public Circle getAllCircles(int ID) {
		Circle circle=null;
		
			try {
				con = dataSource.getConnection();
				 String cmd = "select * from Circle where ID=?";
					pst = con.prepareStatement(cmd);
					pst.setInt(1,ID);
					ResultSet rs=pst.executeQuery();
					if(rs.next()){
						circle=new Circle(ID,rs.getString("Name"));
					}
					   pst.close();
					   rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
			return circle;
			}
		

	

}
