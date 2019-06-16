package com.zzx.spring;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person p = (Person)ctx.getBean("person");
//		System.out.println(ToStringBuilder.reflectionToString(p, ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println(ToStringBuilder.reflectionToString(p.getFood(), ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println("---------------------------------------------------------------------");
//
//		Person pName1 = (Person)ctx.getBean("person01");
//		System.out.println(ToStringBuilder.reflectionToString(pName1, ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println(ToStringBuilder.reflectionToString(pName1.getFood(), ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println("---------------------------------------------------------------------");
//
//		Person pName2 = (Person)ctx.getBean("person02");
//		System.out.println(ToStringBuilder.reflectionToString(pName2, ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println(ToStringBuilder.reflectionToString(pName2.getFood(), ToStringStyle.MULTI_LINE_STYLE));
//		System.out.println("---------------------------------------------------------------------");
		
		Person p = (Person)ctx.getBean("person");
		System.out.println(p.getFood().getName());

		System.out.println("*********************************************************************");

		LoopDI03 loopDI03 = (LoopDI03)ctx.getBean("loopDI03");
		System.out.println(ToStringBuilder.reflectionToString(loopDI03, ToStringStyle.MULTI_LINE_STYLE));
		//System.out.println(ToStringBuilder.reflectionToString(loopDI03.getLoopDI01(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");

		LoopDI02 loopDI02 = (LoopDI02)ctx.getBean("loopDI02");
		System.out.println(ToStringBuilder.reflectionToString(loopDI02, ToStringStyle.MULTI_LINE_STYLE));
		//System.out.println(ToStringBuilder.reflectionToString(loopDI02.getLoopDI03(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");

		LoopDI01 loopDI01 = (LoopDI01)ctx.getBean("loopDI01");
		System.out.println(ToStringBuilder.reflectionToString(loopDI01, ToStringStyle.MULTI_LINE_STYLE));
		//System.out.println(ToStringBuilder.reflectionToString(loopDI01.getLoopDI02(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");

		Food food = ctx.getBean("food", Food.class);
		System.out.println(ToStringBuilder.reflectionToString(food.getPropertiesName(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ToStringBuilder.reflectionToString(food.getListName(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ToStringBuilder.reflectionToString(food.getMapName(), ToStringStyle.MULTI_LINE_STYLE));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(ToStringBuilder.reflectionToString(food.getSetName(), ToStringStyle.MULTI_LINE_STYLE));


	}

}
