package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/*
	 * 检验用户登录业务
	 */
	public User checkLogin(String username, String password) {
		User user = userDao.findByUsername(username);
		if (user != null && user.getUpassword().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public void Regist(User user) {
		userDao.registerUser(user.getUname(), user.getUpassword());
	}
}