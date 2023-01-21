package marvel;

import java.time.LocalDate;

public class Movie {
	private String title;
	private String titleEng;
	private Long boxOffice;
	private LocalDate releaseDate;
	
	public Movie(String title, String titleEng, Long boxOffice, LocalDate releaseDate) {
		super();
		this.title = title;
		this.titleEng = titleEng;
		this.boxOffice = boxOffice;
		this.releaseDate = releaseDate;
	}

	public Movie() {

	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", titleEng=" + titleEng + ", boxOffice=" + boxOffice + ", releaseDate="
				+ releaseDate + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEng() {
		return titleEng;
	}

	public void setTitleEng(String titleEng) {
		this.titleEng = titleEng;
	}

	public Long getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(Long boxOffice) {
		this.boxOffice = boxOffice;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
		
}
