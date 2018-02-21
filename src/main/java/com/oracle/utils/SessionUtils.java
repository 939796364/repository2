package com.oracle.utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtils {
	public static SqlSession getSession() throws IOException {
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().
				build(Resources.getResourceAsReader("configuration.xml"));
		SqlSession session=factory.openSession();
		return session;
	}
}
