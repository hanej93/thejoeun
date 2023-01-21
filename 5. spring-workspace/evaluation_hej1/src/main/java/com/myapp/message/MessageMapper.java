package com.myapp.message;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface MessageMapper {

		
	// selectMsgList
	@Select("select * from guestbook_message")
	public List<MessageDto> selectMsgList();
	
	// selectMsg
	@Select("select * from guestbook_message where message_id = #{messageId}")
	public MessageDto selectMsg(int messageId);
	

	
	// insertMsg
	@Insert("insert into guestbook_message values(#{messageId}, #{guestName}, #{password}"
			+ ", #{message}, #{writeDate}, #{updateDate} )")
	@Options(useGeneratedKeys = true, keyProperty = "messageId")
	public int insertMsg(MessageDto msg);
	
	// updateMsg
	@Update("update guestbook_message set guest_name = #{guestName}, password = #{password}, message = #{message}, write_date = #{writeDate}, update_date = #{updateDate}"
			+ " where message_id = #{messageId}")
	public int updateMsg(MessageDto msg);
	
	// deleteMsg
	@Delete("delete from guestbook_message where message_id = #{messageId} ")
	public int deleteMsg(int messageId);
	
	
	
}
