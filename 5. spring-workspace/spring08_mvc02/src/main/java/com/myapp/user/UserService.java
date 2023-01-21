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
		return userMapper.selectUsers();
	}
	
	
	// 유저 정보를 삽입하는 메서드
	public User joinUser(User user) {
		user.setJoinedDate(LocalDateTime.now());
		int affectedRows = userMapper.insertUser(user);
		
		if(affectedRows == 1) {
			return new User(user.getId(), user.getUserId(), user.getPassword(), user.getBirthDate(), user.getPhone(), user.getAddress(), user.getJoinedDate());
		} else {
			return null;
		}
	}
	
	// 유저를 아이디로 조회하는 메서드
	public User getUserById(int id) {
		
		User user = userMapper.selectOneById(id);
		
		return user;
	}
	
	// 해당 유저를 수정하는 메서드
	public User updateUser(User user) {
		
		int affectedRows =  userMapper.updateUser(user);
		
		if(affectedRows == 1) {
			return new User(user.getId(), user.getUserId(), user.getPassword(), user.getBirthDate(), user.getPhone(), user.getAddress(), user.getJoinedDate());
		} else {
			return null;
		}
		
	}
	
	
	
}














