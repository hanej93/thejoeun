package com.myapp.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/list")
	public String showUserList(Model model) {

		// 서비스를 이용하여 데이터를 가져옴
		List<User> userList = userService.getUserList();

		// 모델을 이용하여 데이터를 담음
		model.addAttribute("userList", userList);
		// 결과 화면으로 데이터를 보낸다
		return "userListView";
	}

	@GetMapping("/input")
	public String showUserInputForm() {

		// user/input요청이 왔을 때
		return "userInputForm";
	}

	@PostMapping("/input") 
	public String inputForm(Model model, User user) {
		
		// 데이터가 정상적으로 들어오는지 확인
		// System.out.println(user);
		
		// 넘어온 데이터를 service를 이용해서 디비에 넣는다.
		User resultUser = userService.joinUser(user);
		model.addAttribute("whatDid", "삽입");
		// 결과화면으로 추가된 데이터를 보여주자
		model.addAttribute("user", resultUser);
		
		// 결과화면으로 보냄
		return "result"; 
	}
	
	@GetMapping("/update")
	public String showUserUpdateForm(Model model, int id) {
		
		User user = userService.getUserById(id);
		
		model.addAttribute("user", user);
		
		return "updateForm";
	}
	 
	@PostMapping("/update")
	public String UpdateUser(Model model, User user) {
		
		User resultUser = userService.updateUser(user);
		
		model.addAttribute("whatDid", "수정");
		model.addAttribute("user", resultUser);
		
		return "result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
