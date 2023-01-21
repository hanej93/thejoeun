package com.myapp.user;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public List<User> getUserList() { 
		return userMapper.selectList();
	}

	public boolean addUser(User user) {
		user.setJoinedDate(LocalDateTime.now());
		int affectedRows = userMapper.insertUser(user);
		if(affectedRows > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
