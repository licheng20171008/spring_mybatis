package com.yx.ssm.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yx.ssm.po.Infomation;

public class MybatisServlet {

	private ApplicationContext applicationContext;
	public MybatisServlet(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}


	private void excute() throws Exception {

		InfomationDaoImpl infomationDaoImpl = (InfomationDaoImpl) applicationContext.getBean("infomationDaoImpl");
		Infomation ifm = infomationDaoImpl.findInfoById(1);
		System.out.println(ifm);
	};
	
	public static void main(String[] args) throws Exception {
		MybatisServlet ms = new MybatisServlet();
		ms.excute();
	}

}
