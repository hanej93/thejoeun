package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import board.Board;
import comment.Comment;
import mapper.BoardWithComment;
import service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class CommentTest {
	
	@Autowired
	BoardWithComment bwc;
	
	@Autowired
	BoardService boardService;
	
	@Test @Ignore
	public void test() {
		assertNotNull(bwc);
		Board board = bwc.selectBoardWithComment(1);
		
		System.out.println(board.getId());
		System.out.println(board.getContent());
		System.out.println(board.getWriteDate());
		
		for(Comment c : board.getCommentList()) {
			System.out.println(c.getId());
			System.out.println(c.getBoardId());
			System.out.println(c.getCommentContent());
			System.out.println(c.getWriteDate());
		}
	}
	
	@Test
	public void deleteTest() {
		try {
			boardService.deleteBoardAndComment(1);
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
	}

}
