package com.zzx.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zzx.spring.controller.LoginController;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginController ls = ctx.getBean("login", LoginController.class);
		ls.login("zhangsan", "@Passw0rd");
//		ls.login("zhangsan", "");
	}

}
