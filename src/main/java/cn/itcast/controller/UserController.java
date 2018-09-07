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

// 这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
// 这样保证了session中存在user这个对象
@SessionAttributes("user")
public class UserController {

	@Autowired
	private UserService userServivce;

	// 正常访问login页面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	
}