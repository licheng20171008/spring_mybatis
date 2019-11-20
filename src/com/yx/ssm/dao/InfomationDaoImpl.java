package com.yx.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yx.ssm.po.Infomation;

public class InfomationDaoImpl extends SqlSessionDaoSupport implements InfomationDao {

	@Override
	public Infomation findInfoById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		Infomation info = sqlSession.selectOne("test.findInfoById", id);
		return info;
	}
}
