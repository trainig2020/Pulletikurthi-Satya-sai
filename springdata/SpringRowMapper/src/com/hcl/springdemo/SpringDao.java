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
	Connection con=null;
	PreparedStatement pst;
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
	
	
	public  Circle GetCircleId(int ID){
		String sql="SELECT * FROM CIRCLE where ID= ?";
		return	template.queryForObject(sql, new Object[]{ID},new getMap());
		// jdbc templet doesnt know circle is a sting or int so we have go for
//		row mapper  .we have to create inner class for the row mapper
		
		 
		
	}
//	for listing all the values in table
	public List<Circle> getAllcircles(){
		String sql= "SELECT * FROM CIRCLE";
		return template.query(sql,new getMap());
		
	}
private static final class getMap implements RowMapper<Circle> {

	@Override
	public Circle mapRow(ResultSet resultset, int rownum) throws SQLException {
		Circle circle=new Circle();
		circle.setID(resultset.getInt("ID"));
		circle.setName(resultset.getString("Name"));
		
		return circle;
	}
	
}
}
