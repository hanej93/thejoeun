package com.myapp.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class UserAjaxController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserAjaxController.class);
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/main")
	public String showMain() {
		return "ajax/main";
	}
	
	
	// ajax로는 화면을 보내는게 아니라 데이터만 보낸다.
	@RequestMapping("/list")
	public @ResponseBody List<User> getUserList(){
		return userService.getUserList();
	}
	
	@PostMapping("/add")
	@ResponseBody
	public boolean addUser(User user) {

		return userService.addUser(user);
	}
	
}
