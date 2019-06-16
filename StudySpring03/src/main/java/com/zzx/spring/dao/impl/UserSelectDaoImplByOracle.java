package com.zzx.spring.dao.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zzx.spring.dao.UserSelectDao;
import com.zzx.spring.entity.User;

@Component("UserSelectDaoImplByOracle")
public class UserSelectDaoImplByOracle implements UserSelectDao {

	@Autowired
	private User user;
	
	public User selectByName(String id, String pw) {
		System.out.println("select Name form Oracle");

		if (!StringUtils.isBlank(id) && !StringUtils.isBlank(pw)) {
			System.out.print("【");
			System.out.print(" id：" + id);
			System.out.print(" password：" + pw);
			System.out.print(" name：" + user.getName());
			System.out.println(" 】");
			return user;
		} else {
			System.out.print("指定的用户名没有发现 【");
			System.out.print(" id：" + id);
			System.out.print(" password：" + pw);
			System.out.println(" 】");
		}
		return null;
	}

}
