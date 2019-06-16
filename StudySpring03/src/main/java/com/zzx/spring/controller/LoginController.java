package com.zzx.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zzx.spring.entity.User;
import com.zzx.spring.service.LoginService;

/**
 * @Component > 注册bean 相当于 <bean id=""
 * Controller 负责逻辑跳转
 * web中，由Controller层接入
 * @author Administrator
 *
 */

@Component("login")
public class LoginController {
	
	//自动按类型注入
	@Autowired
	private LoginService ls;
	
	public void login(String id, String password) {
		System.out.println("Start-------------------------------");
		String name = ls.login(id, password);
		System.out.println("-------------------------------End-" + name);
	}

}
