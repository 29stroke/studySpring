package com.zzx.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zzx.spring.dao.UserSelectDao;
import com.zzx.spring.entity.User;

/**
 * ����ҵ���߼�
 * @author Administrator
 *
 */
@Component
public class LoginService {
	
	//������ע�룬 ָ��id
	@Autowired
	@Qualifier("UserSelectDaoImplByOracle")
	private UserSelectDao oracleDB; 
	
	public String login(String id, String password) {
		System.out.println("�û���Ϣȡ�ÿ�ʼ������");
		String reName = "";
		User us = oracleDB.selectByName(id, password);
		if(us != null) {
			reName = us.getName();
			System.out.println("��¼�ɹ�����ӭ�� " + us.getName() + "����");
		} else {
			System.out.println("�û�id�������벻�������������룡���� ");
		}
		System.out.println("�û���Ϣȡ�����ˡ�����");
		return reName;
	}

}
