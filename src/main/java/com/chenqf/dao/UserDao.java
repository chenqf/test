package com.chenqf.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable(String name){
		String sql = "create table " + name + " (id int primary key , name varchar(60));";
		jdbcTemplate.execute(sql);
	}
}
