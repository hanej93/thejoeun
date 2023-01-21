package jsp08_mvc.guestbook.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MessageDao {
	// 싱글톤으로 객체 생성
	private static MessageDao instance = new MessageDao();
	
	private MessageDao() {}
	public static MessageDao getInstance() {
		return instance;
	}
	
	// 전체 개수를 가져오는 메서드
	public int selectTotalCount(Connection conn) throws SQLException {
		String sql = "select count(*) from guestbook";
		
		try(Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)
				){
			if(rs.next()) {
				return rs.getInt(1);
			} else {
				return 0;
			}
		}
	}
	
	// 방명록 '한 페이지' 가져오기
	public List<MessageDto> selectMessageList(Connection conn, int firstRow, int messageCountPerPage) throws SQLException{
		String sql = "select message_id, guest_name, message, write_date, update_date from guestbook order by message_id desc limit ?,?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, firstRow);
			pst.setInt(2, messageCountPerPage);
			
			try(ResultSet rs = pst.executeQuery()){
				List<MessageDto> messageList = new ArrayList<MessageDto>() ;
				while(rs.next()) {
					// 각각의 메시지를 리스트에 담음
					messageList.add(new MessageDto(
							rs.getInt("message_id"),
							rs.getString("guest_name"),
							rs.getString("message"),
							rs.getTimestamp("write_date").toLocalDateTime(),
							rs.getTimestamp("update_date").toLocalDateTime()
							) );
				}
				return messageList;
			}
			
		}
		
		
	}
	
	// 디비에 메서지를 insert하는 메서드
	public void insert(Connection conn, MessageDto messageDto) throws SQLException {
		String sql = "insert into guestbook values(?,?,?,?,?)";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, messageDto.getMessageId());
			pst.setString(2, messageDto.getGuestName());
			pst.setString(3, messageDto.getMessage());
			pst.setTimestamp(4, Timestamp.valueOf(messageDto.getWriteDate()));
			pst.setTimestamp(5, Timestamp.valueOf(messageDto.getUpdateDate()));
			
			pst.executeUpdate();
		}
		
	}
	
	public MessageDto selectMessageById(Connection conn,int messageId) throws SQLException {
		
		String sql = "select * from guestbook where message_id = ?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, messageId);
			
			try(ResultSet rs = pst.executeQuery()){
				
				if(rs.next()) {
					return new MessageDto(
							rs.getInt("message_id"),
							rs.getString("guest_name"),
							rs.getString("message"),
							rs.getTimestamp("write_date").toLocalDateTime() ,
							rs.getTimestamp("update_date").toLocalDateTime());
				} else {
					return null;
				}
				
			}
		}
				
	}
	
	public void update(Connection conn, MessageDto messageDto) throws SQLException {
		
		String sql = "update guestbook set guest_name=? , message=?,"
				+ " write_date=?, update_date=? where message_id=?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setString(1, messageDto.getGuestName());
			pst.setString(2, messageDto.getMessage());
			pst.setTimestamp(3, Timestamp.valueOf(messageDto.getWriteDate()));
			pst.setTimestamp(4, Timestamp.valueOf(messageDto.getUpdateDate()));
			pst.setInt(5, messageDto.getMessageId());
			
			pst.executeUpdate();
			
		}
		
	}
	
	
	public void delete(Connection conn, int messageId) throws SQLException {

		String sql = "delete from guestbook where message_id =?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, messageId);
			
			pst.executeUpdate();
		}
		
	}
	
}
