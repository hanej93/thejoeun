package day0415MarvelMovie;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movie {
	private int id, runningTime, productionCost, koreanNumberOfAudience;
	private String genre, director, scenario, title, producer, actor, music, rate;
	private LocalDate beginFilming, endFilming, releaseDate;
	private long northAmericaBoxOffice, worldBoxOffice;
	private LocalDateTime wDate, uDate;

	

	public static class Builder {
		private int id, runningTime, productionCost, koreanNumberOfAudience;
		private String genre, director, scenario, title, producer, actor, music, rate;
		private LocalDate beginFilming, endFilming, releaseDate;
		private long northAmericaBoxOffice, worldBoxOffice;
		private LocalDateTime wDate, uDate;

		// 자기자신(Builder 인스턴스)를 반환하는 메서드
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setRunningTime(int runningTime) {
			this.runningTime = runningTime;
			return this;
		}

		public Builder setProductionCost(int productionCost) {
			this.productionCost = productionCost;
			return this;
		}

		public Builder setKoreanNumberOfAudience(int koreanNumberOfAudience) {
			this.koreanNumberOfAudience = koreanNumberOfAudience;
			return this;
		}

		public Builder setGenre(String genre) {
			this.genre = genre;
			return this;
		}

		public Builder setDirector(String director) {
			this.director = director;
			return this;
		}

		public Builder setScenario(String scenario) {
			this.scenario = scenario;
			return this;
		}

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setProducer(String producer) {
			this.producer = producer;
			return this;
		}

		public Builder setActor(String actor) {
			this.actor = actor;
			return this;
		}

		public Builder setMusic(String music) {
			this.music = music;
			return this;
		}

		public Builder setRate(String rate) {
			this.rate = rate;
			return this;
		}

		public Builder setBeginFilming(LocalDate beginFilming) {
			this.beginFilming = beginFilming;
			return this;
		}

		public Builder setEndFilming(LocalDate endFilming) {
			this.endFilming = endFilming;
			return this;
		}

		public Builder setReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}

		public Builder setNorthAmericaBoxOffice(long northAmericaBoxOffice) {
			this.northAmericaBoxOffice = northAmericaBoxOffice;
			return this;
		}

		public Builder setWorldBoxOffice(long worldBoxOffice) {
			this.worldBoxOffice = worldBoxOffice;
			return this;
		}

		public Builder setwDate(LocalDateTime wDate) {
			this.wDate = wDate;
			return this;
		}

		public Builder setuDate(LocalDateTime uDate) {
			this.uDate = uDate;
			return this;
		}
		
		// Movie 인스턴스를 생성하여 반환하는 메서드
		public Movie build() {
			// Movie에 Builder 인스턴스를 매개변수로 넣어 객체를 생성
			return new Movie(this);
		}
	}

	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", runningTime=" + runningTime + ", productionCost=" + productionCost
				+ ", koreanNumberOfAudience=" + koreanNumberOfAudience + ", genre=" + genre + ", director=" + director
				+ ", scenario=" + scenario + ", title=" + title + ", producer=" + producer + ", actor=" + actor
				+ ", music=" + music + ", rate=" + rate + ", beginFilming=" + beginFilming + ", endFilming="
				+ endFilming + ", releaseDate=" + releaseDate + ", northAmericaBoxOffice=" + northAmericaBoxOffice
				+ ", worldBoxOffice=" + worldBoxOffice + ", wDate=" + wDate + ", uDate=" + uDate + "]";
	}


	private Movie(Builder builder) {
		this.id = builder.id;
		this.runningTime = builder.runningTime;
		this.productionCost = builder.productionCost;
		this.koreanNumberOfAudience = builder.koreanNumberOfAudience;
		this.genre = builder.genre;
		this.director = builder.director;
		this.scenario = builder.scenario;
		this.title = builder.title;
		this.producer = builder.producer;
		this.actor = builder.actor;
		this.music = builder.music;
		this.rate = builder.rate;
		this.beginFilming = builder.beginFilming;
		this.endFilming = builder.endFilming;
		this.releaseDate = builder.releaseDate;
		this.northAmericaBoxOffice = builder.northAmericaBoxOffice;
		this.worldBoxOffice = builder.worldBoxOffice;
		this.wDate = builder.wDate;
		this.uDate = builder.uDate;
	}


	public int getId() {
		return id;
	}


	public int getRunningTime() {
		return runningTime;
	}


	public int getProductionCost() {
		return productionCost;
	}


	public int getKoreanNumberOfAudience() {
		return koreanNumberOfAudience;
	}


	public String getGenre() {
		return genre;
	}


	public String getDirector() {
		return director;
	}


	public String getScenario() {
		return scenario;
	}


	public String getTitle() {
		return title;
	}


	public String getProducer() {
		return producer;
	}


	public String getActor() {
		return actor;
	}


	public String getMusic() {
		return music;
	}


	public String getRate() {
		return rate;
	}


	public LocalDate getBeginFilming() {
		return beginFilming;
	}


	public LocalDate getEndFilming() {
		return endFilming;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public long getNorthAmericaBoxOffice() {
		return northAmericaBoxOffice;
	}


	public long getWorldBoxOffice() {
		return worldBoxOffice;
	}


	public LocalDateTime getwDate() {
		return wDate;
	}


	public LocalDateTime getuDate() {
		return uDate;
	}
	
}
