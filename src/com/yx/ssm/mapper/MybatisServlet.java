package com.yx.ssm.mapper;

import com.yx.ssm.po.Infomation;

public class MybatisServlet extends GetMapperInterface{

	private void excute() throws Exception {

		InfomationMapper infomationMapper = this.getInfomationMapper();
//		InfomationMapper infomationMapper1 = (InfomationMapper) this.excute(InfomationMapper.class);
		Infomation ifm1 = infomationMapper.findInfoById(1);
		System.out.println(ifm1);
//		Infomation ifm2 = infomationMapper.findInfoById(1);
//		System.out.println(ifm2);
//		Infomation ifm3 = infomationMapper1.findInfoById(1);
//		System.out.println(ifm3);
//		Infomation ifm4 = infomationMapper1.findInfoById(1);
//		System.out.println(ifm4);
	};
	
	public static void main(String[] args) throws Exception {
		MybatisServlet ms = new MybatisServlet();
		ms.excute();
	}

}
