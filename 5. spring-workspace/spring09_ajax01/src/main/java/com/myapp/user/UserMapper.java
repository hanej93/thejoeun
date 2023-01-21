package com.myapp.user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	// Mybatis로 연결해서 스캔도 할 수 있도록 추가해야 함
	
	@Select("select id, user_id, password, birth_date, phone, address, joined_date from user")
	public List<User> selectList();

	
	@Insert("insert into user(id, user_id, password, birth_date, phone, address, joined_date) "
			+ "values(#{id}, #{userId}, #{password}, #{birthDate}, #{phone}, #{address}, #{joinedDate})")
	public int insertUser(User user);
	
	
}
