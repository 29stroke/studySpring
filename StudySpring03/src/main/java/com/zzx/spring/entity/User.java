package com.zzx.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ORM映射
 * 线程安全，成员属性，不可共享
 * @author Administrator
 *
 */
@Component
@Scope("prototype")
public class User {
	
	//直接注入值，无需get/set方法
	@Value("张三大人")
	private String name;

	public String getName() {
		return name;
	}
}
