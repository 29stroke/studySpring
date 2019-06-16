package com.zzx.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zzx.spring.dao.UserSelectDao;
import com.zzx.spring.entity.User;

/**
 * 具体业务逻辑
 * @author Administrator
 *
 */
@Component
public class LoginService {
	
	//按类型注入， 指定id
	@Autowired
	@Qualifier("UserSelectDaoImplByOracle")
	private UserSelectDao oracleDB; 
	
	public String login(String id, String password) {
		System.out.println("用户信息取得开始。。。");
		String reName = "";
		User us = oracleDB.selectByName(id, password);
		if(us != null) {
			reName = us.getName();
			System.out.println("登录成功，欢迎您 " + us.getName() + "先生");
		} else {
			System.out.println("用户id或者密码不正，请重新输入！！！ ");
		}
		System.out.println("用户信息取得完了。。。");
		return reName;
	}

}
