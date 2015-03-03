package com.chenqf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.chenqf.dao.UserDao;
import com.chenqf.dto.UserDto;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserDto test(){
		UserDto user = new UserDto();
		user.setName("陈其丰");
		user.setAge(27);
		user.setSex("1");
		//userDao.createTable("t_user");
		return user;
	}
	
	public UserDto test1(String name,String sex,
			@RequestParam("age") int age){
		UserDto user = new UserDto();
		user.setName(name);
		user.setSex(sex);
		user.setAge(age);
		return user;
	}
}
