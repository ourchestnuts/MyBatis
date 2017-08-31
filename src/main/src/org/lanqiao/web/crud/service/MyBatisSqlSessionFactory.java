package main.src.org.lanqiao.web.crud.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	//饿汉式  单例模式
public static SqlSessionFactory getSqlSessionFactory() {
	if (sqlSessionFactory == null) {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			throw new RuntimeException(e.getCause());
		}
	}
	return sqlSessionFactory;
}

public static SqlSession openSession() {
	return getSqlSessionFactory().openSession();
}
}
