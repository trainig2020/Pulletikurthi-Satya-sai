package com.hcl.springdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringDao {
	private JdbcTemplate template =new JdbcTemplate();
	
//	@Autowired we can use same for data source set method
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.template=new JdbcTemplate(dataSource);
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
	
	public int getCircleCount() {
		String sql="SELECT COUNT(*) FROM CIRCLE";
//		template.setDataSource(getDataSource());
		//this is for integer type
		return template.queryForInt(sql);
	}
		
		public String getCircleName(int ID) {
//			for string we need to provide an object in jdbctemplete
			String sql="SELECT NAME FROM CIRCLE where ID= ?";
			return template.queryForObject(sql,new Object[]{ID}, String.class);
		
	}
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
		

	

}
