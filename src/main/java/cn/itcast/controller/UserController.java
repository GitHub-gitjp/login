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

	// ���ύ������·��
	@RequestMapping("/checkLogin")
	public String checkLogin(User user, Model model) {
		// ����service����
		user = userServivce.checkLogin(user.getUname(), user.getUpassword());
		// ����user����ӵ�model�ﲢ����ת���ɹ�ҳ��
		if (user != null) {
			model.addAttribute("user", user);
			return "success";
		}
		return "fail";
	}

	// ���Գ�������ת����һ��ҳ���Ƿ����ȡ��sessionֵ
	@RequestMapping("/anotherpage")
	public String hrefpage() {

		return "anotherpage";
	}

	// ע������
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session) {
		// ͨ��session.invalidata()������ע����ǰ��session
		session.invalidate();
		return "login";
	}

	@RequestMapping("/regist")
	public String regist() {
		return "regist";
	}

	@RequestMapping("/doRegist")
	public String doRegist(User user, Model model) {
		System.out.println(user.getUname());
		userServivce.Regist(user);
		return "success";
	}
}