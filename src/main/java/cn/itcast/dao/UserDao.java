package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import cn.itcast.Utils.MybatisUtils;
import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;

public class UserDao {
	@Test
	public void getUser() {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> user = mapper.getAllUsers();
		session.commit();
		session.close();
		System.out.println(user.toString());
	}
	
}
