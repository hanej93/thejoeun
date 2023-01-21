package jsp07_db.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageDao {
	
	// 싱글톤
	private static MessageDao instance = new MessageDao();
	private MessageDao() {}
	
	public static MessageDao getInstance() {
		return instance;
	}
	
	// 메시지를 디비에 넣는 메서드
	public void insert(Connection conn,MessageDto messageDto) throws SQLException {
		String sql = "insert into guestbook values(?,?,?,?)";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, messageDto.getMessageId());
			pst.setString(2, messageDto.getGuestName());
			pst.setString(3, messageDto.getMessage());
			pst.setTimestamp(4, Timestamp.valueOf(messageDto.getWriteDate()));
			
			pst.executeUpdate();
		}
	}
	
	// 전체 메시지 조회
	public List<MessageDto> selectList(Connection conn) throws SQLException{
		List<MessageDto> messageList = new ArrayList<MessageDto>();
		
		String sql = "select message_id, guest_name, message, write_date from guestbook";
		
		try(PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()){
				
			while(rs.next()) {
				MessageDto messageDto = new MessageDto(
							rs.getInt("message_id"),
							rs.getString("guest_name"),
							rs.getString("message"),
							rs.getTimestamp("write_date").toLocalDateTime()
						);
				messageList.add(messageDto);
			}
			
			return messageList;
		}
	}
	
	// id로 방명록 하나를 조회하는 메서드
	public MessageDto selectOneById(Connection conn, int messageId) throws SQLException {
		String sql = "select message_id, guest_name, message, write_date from guestbook where message_id=?";
		
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
	
	// 수정
	public void update(Connection conn, MessageDto messageDto) throws SQLException {
		String sql = "update guestbook set guest_name=?, message=?, write_date=? "
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
