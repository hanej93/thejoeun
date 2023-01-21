package com.myapp.user;

import java.io.File;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	FileUploadService fileUploadService;
	
	@GetMapping("/list")
	public String showList(Model model) {
		logger.info("showList");
		List<User> userList = userService.getUserList();
		model.addAttribute("userList", userList);
		
		return "userListView";
	}
	
	@GetMapping("/fileUpload")
	public String showFileUploadForm() {
		
		return "fileUploadForm";
	}
	
	
	@PostMapping("/fileUpload")
	public String fileUpload(Model model, @Param("name") String name, @Param("uploadFile") MultipartFile uploadFile) {
		System.out.println("name: " + name);
		System.out.println("file: " + uploadFile);
		System.out.println("파일 원본 이름: " + uploadFile.getOriginalFilename());
		System.out.println("파일 크기: " + uploadFile.getSize());
		System.out.println("파일의 name 값: " + uploadFile.getName());
		
		boolean result = fileUploadService.saveUploadedFile(uploadFile);
		
		model.addAttribute("result", result);
		
		// 화면에 보여줄 이미지 주소
		String img = uploadFile.getOriginalFilename();
		model.addAttribute("img", img);
		
		return "uploadResult";
	}
	
}
