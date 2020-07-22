package com.hcl.springtest;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class SimpleJdbcTempletDao extends SimpleJdbcDaoSupport {
	public int getCircleCount() {
		String sql="SELECT COUNT(*) FROM CIRCLE";
		return this.getJdbcTemplate().queryForInt(sql);
	}
}
