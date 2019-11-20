package com.yx.ssm.mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetApplicationContext {
	private ApplicationContext applicationContext;
	public GetApplicationContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	protected Object excute(Class<?> clazz) {
		String interfaceName = (new StringBuilder()).append(Character.toLowerCase(
				clazz.getSimpleName().charAt(0))).append(clazz.getSimpleName().substring(1)).toString();
		Object obj = applicationContext.getBean(interfaceName);
		return obj;
	}
}
