package cn.itcast.dao;

import org.apache.ibatis.annotations.Param;

import cn.itcast.domain.User;

public interface UserDao {

	// ����û�
	public void addUser(User user);

	// �����û����������ѯ�û�
	// ע��������������Զ���װ��map���ϣ������ڼ�Ϊ��
	public void findLog(@Param("name") String name, @Param("password") String password);

}
