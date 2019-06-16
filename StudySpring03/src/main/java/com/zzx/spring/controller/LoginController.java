package com.zzx.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zzx.spring.entity.User;
import com.zzx.spring.service.LoginService;

/**
 * @Component > ע��bean �൱�� <bean id=""
 * Controller �����߼���ת
 * web�У���Controller�����
 * @author Administrator
 *
 */

@Component("login")
public class LoginController {
	
	//�Զ�������ע��
	@Autowired
	private LoginService ls;
	
	public void login(String id, String password) {
		System.out.println("Start-------------------------------");
		String name = ls.login(id, password);
		System.out.println("-------------------------------End-" + name);
	}

}
