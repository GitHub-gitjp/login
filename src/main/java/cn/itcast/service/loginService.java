package cn.itcast.service;

import cn.itcast.dao.UserDao;

public class loginService {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.getUser();
	}
}
