package mapper;

import org.apache.ibatis.annotations.Mapper;

import board.Board;

@Mapper
public interface BoardWithComment {
	
	Board selectBoardWithComment(int id);
	
	int deleteBoardbyId(int id);
	
	int deleteCommentbyBoardId(int id);
	
}
