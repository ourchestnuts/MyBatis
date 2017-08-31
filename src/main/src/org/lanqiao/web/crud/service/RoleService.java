package main.src.org.lanqiao.web.crud.service;

import org.apache.ibatis.session.SqlSession;

import main.src.org.lanqiao.web.crud.entity.Role;
import main.src.org.lanqiao.web.crud.roledao.RoleMapper;

public class RoleService {
	public void roleInsert(Role role){
		SqlSession sqlSession=MyBatisSqlSessionFactory.openSession();
		RoleMapper rolemapper=sqlSession.getMapper(RoleMapper.class);
		rolemapper.roleInsert(role);
		sqlSession.commit();
		sqlSession.close();
	}

}
