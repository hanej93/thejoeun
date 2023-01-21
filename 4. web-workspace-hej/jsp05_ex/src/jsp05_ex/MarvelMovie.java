package jsp05_ex;

import java.time.LocalDate;

public class MarvelMovie {
	private String korTitle;
	private String engTitle;
	private long worldBoxOffice;
	private LocalDate releaseDate;
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getKorTitle() {
		return korTitle;
	}
	public void setKorTitle(String korTitle) {
		this.korTitle = korTitle;
	}
	public String getEngTitle() {
		return engTitle;
	}
	public void setEngTitle(String engTitle) {
		this.engTitle = engTitle;
	}
	public long getWorldBoxOffice() {
		return worldBoxOffice;
	}
	public void setWorldBoxOffice(long worldBoxOffice) {
		this.worldBoxOffice = worldBoxOffice;
	}
}
