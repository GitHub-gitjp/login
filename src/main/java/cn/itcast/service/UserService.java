package cn.itcast.service;

import cn.itcast.domain.User;

public interface UserService {
	// �û�ע��
	void regist(User user);

	// �û���¼
	void login(String name, String password);
}
