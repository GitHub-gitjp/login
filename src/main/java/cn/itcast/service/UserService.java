package cn.itcast.service;


import cn.itcast.domain.User;

//Service��ӿ�
public interface UserService {
    
    //�����û���¼
    User checkLogin(String uname,String upassword);
    void Regist(User user);
}