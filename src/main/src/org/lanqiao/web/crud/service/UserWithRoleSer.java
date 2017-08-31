package main.src.org.lanqiao.web.crud.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import main.src.org.lanqiao.web.crud.entity.UserWithRole;
import main.src.org.lanqiao.web.crud.userwithrole.UserWithRoleMapper;

public class UserWithRoleSer {
	public List<UserWithRole> findAll(){
		SqlSession sqlSession=MyBatisSqlSessionFactory.openSession();
		try{UserWithRoleMapper userwithrolemapper=sqlSession.getMapper(UserWithRoleMapper.class);
		return userwithrolemapper.findAll();
		}finally{
			sqlSession.close();
		}

	}

}
