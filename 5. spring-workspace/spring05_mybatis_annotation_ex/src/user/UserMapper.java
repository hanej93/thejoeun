package user;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	
	@Select("select * from user")
	List<User> selectUserList();
	
	@Select("select * from user limit #{startNum}, #{cnttt}")
	List<User> selectUserListByRange(@Param("startNum") int startNum, @Param("cnttt") int cnt);
	
	@Select("select * from user where id = #{id}")
	User selectUserById(int id);
	
	@Select("select * from user where user_id like concat('%', #{keyword}, '%') ")
	List<User> selectUserByKeywordOfName(String keyword);
	
	@Insert("insert into user values(#{id}, #{userId}, #{password}, "
			+ "#{birthDate}, #{phone}, #{address}, #{joinedDate})")
	int insertUser(User user);
	
	@Update("update user set user_id=#{userId}, password=#{password}, "
			+ "birth_date=#{birthDate}, phone=#{phone}, address=#{address}, joined_date=#{joinedDate} where id =#{id}")
	int updateUser(User user);
	
	@Delete("delete from user where id=#{id}")
	int deleteUse(int id);
}
