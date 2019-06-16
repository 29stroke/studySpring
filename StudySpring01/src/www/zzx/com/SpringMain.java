package www.zzx.com;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)ctx.getBean("person");
//		Food f = ctx.getBean("food", Food.class);
//		p.setName("zzx");
//		p.setAge(25);
//		p.setFood(f);
//		f.setName("xxxxx");
		
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getFood());
		
		//System.out.println(ToStringBuilder.reflectionToString(p));
		System.out.println(ToStringBuilder.reflectionToString(p, ToStringStyle.MULTI_LINE_STYLE));
		System.out.println(ToStringBuilder.reflectionToString(p.getFood(), ToStringStyle.MULTI_LINE_STYLE));

	}

}
