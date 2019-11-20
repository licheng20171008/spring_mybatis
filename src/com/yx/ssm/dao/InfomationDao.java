package com.yx.ssm.dao;

import com.yx.ssm.po.Infomation;

public interface InfomationDao {

	// 查询
	public Infomation findInfoById(int id) throws Exception;
}
