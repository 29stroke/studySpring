package com.zzx.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ORMӳ��
 * �̰߳�ȫ����Ա���ԣ����ɹ���
 * @author Administrator
 *
 */
@Component
@Scope("prototype")
public class User {
	
	//ֱ��ע��ֵ������get/set����
	@Value("��������")
	private String name;

	public String getName() {
		return name;
	}
}
