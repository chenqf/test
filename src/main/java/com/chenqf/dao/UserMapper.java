package com.chenqf.dao;

import org.apache.ibatis.annotations.Param;

import com.chenqf.entity.User;

/**
 * 
 * @ClassName MemberAddressMapper
 * @Description TODO
 * @author 
 * @date 2014-10-09 11:07:30
 */
public interface UserMapper {

	
	public void addUser(@Param(value = "name") String name);


	/**
	 * @Title: getById
	 * @Description: 根据主键查询User
	 * @param id
	 * @return: User
	 */
	public User getById(@Param(value = "id") Long id);

}