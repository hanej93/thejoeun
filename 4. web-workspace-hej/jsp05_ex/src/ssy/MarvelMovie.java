package ssy;

import java.time.LocalDate;

public class MarvelMovie {
	private String korName;
	private String engName;
	private long boxOffice;
	private LocalDate openingDate;
	
	public MarvelMovie() {
		
	}

	public String getKorName() {
		return korName;
	}

	public void setKorName(String korName) {
		this.korName = korName;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public long getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(long boxOffice) {
		this.boxOffice = boxOffice;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public MarvelMovie(String korName, String engName, long boxOffice, LocalDate openingDate) {
		super();
		this.korName = korName;
		this.engName = engName;
		this.boxOffice = boxOffice;
		this.openingDate = openingDate;
	}

	@Override
	public String toString() {
		return "MarvelMovie [korName=" + korName + ", engName=" + engName + ", boxOffice=" + boxOffice
				+ ", openingDate=" + openingDate + "]";
	}
	
	
}


