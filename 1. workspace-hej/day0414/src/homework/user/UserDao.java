package homework.user;

import java.util.List;

public interface UserDao {
	// id에 해당되는 user정보를 가져옴
	public User selectWithUserId(User user);
	
	// 디비에 있는 모든 user정보를 가져옴
	public List<User> selectList();
	
	// 디비에 user를 삽입
	public int insert(User user);
	
	// 디비에 user를 수정
	public int update(User user);
	
	// 디비에 user를 삭제
	public int delete(User user);
	
}
