package com.zzx.spring.dao;

import com.zzx.spring.entity.User;

public interface UserSelectDao {
	
	public User selectByName(String id, String pw);

}
