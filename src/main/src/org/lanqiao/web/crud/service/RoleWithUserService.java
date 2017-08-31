package main.src.org.lanqiao.web.crud.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import main.src.org.lanqiao.web.crud.entity.RoleWithUser;
import main.src.org.lanqiao.web.crud.rolewithuser.RoleWithUserMapper;

public class RoleWithUserService {
	public List<RoleWithUser> findAll(){
		SqlSession sqlSession=MyBatisSqlSessionFactory.openSession();
		try{
			RoleWithUserMapper rolewithusers=sqlSession.getMapper(RoleWithUserMapper.class);
			return rolewithusers.findAll();
		}finally{
			sqlSession.close();
		}
	}
}
