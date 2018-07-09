package com.ls.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.pojo.JSONResult;
import com.ls.pojo.Resource;

@RestController
public class HelloController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot";
	}
	
	@RequestMapping("/getResource")
	public JSONResult getResource() {
		Resource bean =new Resource();
		
		BeanUtils.copyProperties(resource, bean);
		
		return JSONResult.ok(bean);
	}
}
