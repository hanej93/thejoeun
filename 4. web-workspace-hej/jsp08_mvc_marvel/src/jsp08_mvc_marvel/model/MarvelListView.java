package jsp08_mvc_marvel.model;

import java.util.List;

public class MarvelListView {
	// , , 한페이지개수, 페이지시작로우, 한화면에 보여질 메시지리스트, 
	
	private int messageTotalCount; // 총메시지개수
	private int currentPageNumber; // 현재페이지
	private int pageTotalCount; // 총 페이지
	private int messageCountPerPage;
	private int firstRow; // 시작로우
	private List<MarvelDto> marvelList;
	public MarvelListView(int messageTotalCount, int currentPageNumber, int messageCountPerPage,
			int firstRow, List<MarvelDto> marvelList) {
		super();
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = firstRow;
		this.marvelList = marvelList;

		if(messageCountPerPage == 0) {
			this.pageTotalCount = 0;
		} else {
			this.pageTotalCount =  (int)Math.ceil((double)messageTotalCount / messageCountPerPage);
		}
	}
	public int getMessageTotalCount() {
		return messageTotalCount;
	}
	public int getCurrentPageNumber() {
		return currentPageNumber;
	}
	public int getPageTotalCount() {
		return pageTotalCount;
	}
	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}
	public int getFirstRow() {
		return firstRow;
	}
	public List<MarvelDto> getMarvelList() {
		return marvelList;
	}	
}
