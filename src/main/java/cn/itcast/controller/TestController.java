package cn.itcast.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个注解相当于@Controller + @ResponseBody，相当于整个类中所有方法的返回值都为json字符串
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "helloWorld")
	@ResponseBody
	public Map<String, String> helloMap(
			@RequestParam(value = "user", required = false, defaultValue = "World") String userName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("hello", userName);
		return map;
	}
}
