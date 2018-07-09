package com.ls.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ls.pojo.JSONResult;
import com.ls.pojo.User;

//@Controller
@RestController  // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		User u = new User();
		u.setName("lslsls");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("liushuai");
//		u.setDesc(null);
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public JSONResult getUserJson() {
		User u = new User();
		u.setName("lslsls");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("liushuai");
		u.setDesc(null);
		return JSONResult.ok(u);
	}
}
