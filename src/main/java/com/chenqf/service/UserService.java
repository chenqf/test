package com.chenqf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.chenqf.dao.UserDao;
import com.chenqf.dao.UserMapper;
import com.chenqf.dto.UserDto;
import com.chenqf.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMapper userMapper;
	
	public User test(){
		UserDto user = new UserDto();
		user.setName("陈其丰");
		user.setAge(27);
		user.setSex("1");
		Long id = (long) 1;
		return userMapper.getById(id);
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
