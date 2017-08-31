package main.src.org.lanqiao.web.crud.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import main.src.org.lanqiao.web.crud.dao.UserMapper;
import main.src.org.lanqiao.web.crud.entity.User;

public class UserService {
	public void insertUser(User user){
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper usermapper=sqlSession.getMapper(UserMapper.class);
			usermapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public List<User> findAll(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper usermapper=sqlSession.getMapper(UserMapper.class);
			List<User> users=usermapper.findAll();
			return users;
		} finally {
			sqlSession.close();
		}
	}

}
