package com.ls.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

	private String name;
	
	@JsonIgnore  // 该注解表示标注不返回前端的字段，被标注后每次返回User时都不返回这个password
	private String password;
	private Integer age;
	
	//后台定义时间模板
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a" , locale = "zh" , timezone = "GTM+8")
	private Date birthday;
	
	//当字段为空时不能传递给前端
	@JsonInclude(Include.NON_NULL)
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", birthday=" + birthday + ", desc="
				+ desc + "]";
	}
	
	
}
