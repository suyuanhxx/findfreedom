package com.findgods.fly.controller;

import com.findgods.fly.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * REVIEW
 * @Description: restful api
 * @author xiaoxu.huang@baidao.com xiaoxu.huang
 * @date 2017/2/24  16:58
 *
 */
@Controller
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/user/{id}")
	@ResponseBody
	User index(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(1233L);
		user.setUsername("sfasdf");
		return user;
	}

}