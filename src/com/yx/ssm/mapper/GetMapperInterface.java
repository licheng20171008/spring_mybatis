package com.yx.ssm.mapper;

public class GetMapperInterface extends GetApplicationContext{
	
	public InfomationMapper getInfomationMapper() {
		return (InfomationMapper) this.excute(InfomationMapper.class);
	}
}
