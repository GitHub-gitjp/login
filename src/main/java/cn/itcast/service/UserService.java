package cn.itcast.service;


import cn.itcast.domain.User;

//Service层接口
public interface UserService {
    
    //检验用户登录
    User checkLogin(String uname,String upassword);
    void Regist(User user);
}