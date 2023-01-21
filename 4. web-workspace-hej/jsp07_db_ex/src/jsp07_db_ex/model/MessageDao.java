package jsp07_db_ex.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MessageDao {
	
	// DAO : Data Access Object 데이터 접근 객체
	
	// 싱글톤
	// 프로젝트가 실행이 되면 객체가 생성이 안되도 바로 실행이 됨(static) 
	private static MessageDao instance = new MessageDao();
	private MessageDao() {}
	
	public static MessageDao getInstance() {
		return instance;
	}
	
	// 메시지를 데이터베이스에 넣어주는 메서드
	public void insert(Connection conn, MessageDto messageDto) throws SQLException {
		String sql = "insert into guestbook values(?,?,?,?)";
	
		// 메모리 누수 방지(클로즈가 안되면 메모리에 계속 할당되있어요)
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, messageDto.getMessageId());
			pst.setString(2, messageDto.getGuestName());
			pst.setString(3, messageDto.getMessage());
			pst.setTimestamp(4, Timestamp.valueOf(messageDto.getWriteDate()));
			
			pst.executeUpdate();
			
		}	
	}
	
	// 전체 메시지 조회
	public List<MessageDto> selectList (Connection conn) throws SQLException{
		List<MessageDto> messageList = new ArrayList<MessageDto>();
		
		String sql = "select message_id, guest_name, message, write_date from guestbook";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				MessageDto messageDto = new MessageDto(
							rs.getInt("message_id"),
							rs.getString("guest_name"),
							rs.getString("message"),
							rs.getTimestamp("write_date").toLocalDateTime()
						);
				messageList.add(messageDto);
			}
			
		}
		
		
		return messageList;
	}
	
	
	// id로 조회
	public MessageDto selectOneById(Connection conn, int messageId) throws SQLException {
		String sql = "select * from guestbook where message_id = ?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, messageId);
			try(ResultSet rs = pst.executeQuery()){
				
				if(rs.next()) {
					MessageDto messageDto = new MessageDto(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getTimestamp(4).toLocalDateTime()
							);
					return messageDto;
				} else {
					return null;
				}
			}
			
		}
		
	}
	
	
	// 업데이트
	public void update(Connection conn, MessageDto messageDto) throws SQLException {
		String sql = "update guestbook set guest_name =?, message=?, write_date=? "
				+ "where message_id=?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setString(1, messageDto.getGuestName());
			pst.setString(2, messageDto.getMessage());
			pst.setTimestamp(3, Timestamp.valueOf(messageDto.getWriteDate()));
			pst.setInt(4, messageDto.getMessageId());
			
			pst.executeUpdate();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
