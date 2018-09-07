package cn.itcast.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

@Controller
@RequestMapping("/user")

// ��������@SessionAttributes������ֱ�Ӱ�model�е�user(Ҳ��key)��������
// ������֤��session�д���user�������
@SessionAttributes("user")
public class UserController {

	@Autowired
	private UserService userServivce;

	// ��������loginҳ��
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	
}