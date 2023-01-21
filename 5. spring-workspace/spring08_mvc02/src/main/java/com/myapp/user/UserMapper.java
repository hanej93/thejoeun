package com.myapp.user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
	
	
	@Select("select id, user_id, password, birth_date, phone, address, joined_date from user"
			+ " where id = #{id}")
	public User selectOneById(int id);
	
	@Select("select id, user_id, password, birth_date, phone, address, joined_date from user"
			+ " where user_id = #{userId}")
	public User selectOneByUserId(int userId);
	
	@Update("update user set user_id = #{userId}, password = #{password}, birth_date = #{birthDate}, phone = #{phone}, address = #{address}, joined_date = #{joinedDate}"
			+ " where id = #{id}")
	public int updateUser(User user);
	
	
	@Select("select id, user_id, password, birth_date, phone, address, joined_date from user")
	public List<User> selectUsers();
	
	@Insert("insert into user(id, user_id, password, birth_date, phone, address, joined_date) "
			+ "values(#{id}, #{userId}, #{password}, #{birthDate}, #{phone}, #{address}, #{joinedDate} )")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int insertUser(User user);
	
	
	
	
	
}
