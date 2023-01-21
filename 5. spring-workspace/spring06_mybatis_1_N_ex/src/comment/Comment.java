package comment;

import java.time.LocalDateTime;

public class Comment {
	private int id;
	private int boardId;
	private String commentContent;
	private LocalDateTime writeDate;
	public Comment(int id, int boardId, String commentContent, LocalDateTime writeDate) {
		super();
		this.id = id;
		this.boardId = boardId;
		this.commentContent = commentContent;
		this.writeDate = writeDate;
	}
	public Comment() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", boardId=" + boardId + ", commentContent=" + commentContent + ", writeDate="
				+ writeDate + "]";
	}
	
	
}
