package com.chenqf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chenqf.dto.UserDto;
import com.chenqf.entity.User;
import com.chenqf.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public User test(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session)throws Exception {
		
		return this.userService.test();
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public UserDto test1(String name,String sex,
			@RequestParam(value = "age", defaultValue = "18") int age) {
		return this.userService.test1(name,sex,age);
	}
	
	@RequestMapping(value = "/test2/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public String test2(HttpServletRequest request,@PathVariable("userId") String userId) {
		return userId;
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView test3()throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
}






