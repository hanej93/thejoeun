package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapper.BoardWithComment;

@Service
public class BoardService {
	
	@Autowired
	BoardWithComment boardWithComment;
	
	
	@Transactional(rollbackFor = Exception.class)
	public void deleteBoardAndComment(int boardId) throws Exception {

		boardWithComment.deleteBoardbyId(boardId);
		
		if(1==1) {
			throw new Exception();
		}
		
		boardWithComment.deleteCommentbyBoardId(boardId);
		
	}
	
	
}
