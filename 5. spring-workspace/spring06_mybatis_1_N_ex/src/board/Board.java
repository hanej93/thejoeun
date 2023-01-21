package board;

import java.time.LocalDateTime;
import java.util.List;

import comment.Comment;

public class Board {
	private int id;
	private String content;
	private LocalDateTime writeDate;
	private List<Comment> commentList;
	@Override
	public String toString() {
		return "Board [id=" + id + ", content=" + content + ", writeDate=" + writeDate + ", commentList=" + commentList
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	public Board() {
		super();
	}
	public Board(int id, String content, LocalDateTime writeDate, List<Comment> commentList) {
		super();
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
		this.commentList = commentList;
	}
	
	
	
}
