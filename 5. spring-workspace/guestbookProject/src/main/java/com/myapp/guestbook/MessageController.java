package com.myapp.guestbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guestbook")
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@GetMapping("/list")
	public String getMessageList(Model model){
		List<MessageDto> messageList = messageService.getMessageList();
		model.addAttribute("messageList",messageList);
		return "guestbook";
	}
	
	@GetMapping("/addMessage")
	public String showAddMessage() {
		return "addMessage";
	}
	
	@PostMapping("/addMessage")
	public String addMessage(MessageDto messageDto, Model model){
		boolean check = messageService.addMessage(messageDto);
		model.addAttribute("check",check);
		return "check";
	}
	
	@GetMapping("/modifyMessage")
	public String getMessage(int messageId, Model model) {
		MessageDto message = messageService.getMessage(messageId);
		model.addAttribute("message",message);
		return "modifyMessage";
	}
	
	@PostMapping("/modifyMessage")
	public String modifyMessage(MessageDto messageDto, Model model) {
		boolean check = messageService.modifyMessage(messageDto);
		model.addAttribute("check", check);
		return "check";
	}
	
	@GetMapping("/deleteMessage")
	public String deleteMessage(MessageDto messageDto, Model model) {
		boolean check = messageService.deleteMessage(messageDto.getMessageId(), messageDto.getPassword());
		model.addAttribute("check",check);
		return "check";
	}
	
	
}
