package com.myapp.guestbook;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MessageMapper {
	
	@Select("select * from guestbook_message")
	public List<MessageDto> selectMsgList();
	
	@Select("select * from guestbook_message where message_id=#{messageId}")
	public MessageDto selectMsg(int messageId);
	
	@Insert("insert into guestbook_message values(#{messageId}, #{guestName}, #{password},"
			+ " #{message}, #{writeDate}, #{updateDate})")
	public boolean insertMsg(MessageDto messageDto);
	
	@Update("update guestbook_message set guest_name=#{guestName}, password=#{password},"
			+ " message=#{message}, write_date=#{writeDate}, update_date=#{updateDate}"
			+ " where message_id=#{messageId}")
	public boolean updateMsg(MessageDto messageDto);

	@Delete("delete from guestbook_message where message_id=#{messageId}")
	public boolean deleteMsg(int messageId);
}
