package com.yx.ssm.mapper;

import com.yx.ssm.po.Infomation;

public interface InfomationMapper {

	// 查询
	public Infomation findInfoById(int id) throws Exception;	
}
