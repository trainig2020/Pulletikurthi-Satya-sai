package com.hcl.springdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
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
	
	public void inserCircle(Circle circle){
		String sql="INSERT INTO CIRCLE(ID,NAME) VALUES(?,?)";
		
	    template.update(sql,new Object[]{circle.getID(),circle.getName()});
		
		}
	public void  createTriangleTable() {
		String sql="CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(50))";
		template.execute(sql);
	}
		}


