package cn.itcast.dao;

import org.apache.ibatis.annotations.Param;

import cn.itcast.domain.User;


public interface UserDao {
    
    
    /**
     * �����û���������
     * @param username ��¼�û��� 
     * @return
     */
    User findByUsername(String username);
    /**
     * ע���û�������
     */
    void registerUser(@Param("username")String username, @Param("password")String password);
}