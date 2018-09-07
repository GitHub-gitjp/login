package cn.itcast.dao;

import org.apache.ibatis.annotations.Param;

import cn.itcast.domain.User;


public interface UserDao {
    
    
    /**
     * 查找用户名和密码
     * @param username 登录用户名 
     * @return
     */
    User findByUsername(String username);
    /**
     * 注册用户和密码
     */
    void registerUser(@Param("username")String username, @Param("password")String password);
}