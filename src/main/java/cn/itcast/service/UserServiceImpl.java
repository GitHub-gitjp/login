package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void regist(User user) {
		userDao.addUser(user);
	}

	@Override
	public void login(String name, String password) {
		userDao.findLog(name, password);
	}
}