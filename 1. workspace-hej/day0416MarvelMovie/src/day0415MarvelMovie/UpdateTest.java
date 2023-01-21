package day0415MarvelMovie;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UpdateTest {
	public static void main(String[] args) {
		// 수정을 해보자

		MovieDao dao = new MovieDaoImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("수정하고자 하는 id값을 입력하세요");
		int id = Integer.parseInt(sc.nextLine());

		try {
			Movie m = dao.selectWithId(id);

			System.out.println("수정할 제목을 입력하세요.");
			String title = sc.nextLine();
			
			
			Movie newMovie = new Movie.Builder()
					.setId(m.getId())
					.setGenre(m.getGenre())
					.setDirector(m.getDirector())
					.setScenario(m.getScenario())
					.setTitle(title)
					.setProducer(m.getProducer())
					.setActor(m.getActor())
					.setMusic(m.getMusic())
					.setBeginFilming(m.getBeginFilming())
					.setEndFilming(m.getEndFilming())
					.setReleaseDate(m.getReleaseDate())
					.setRunningTime(m.getRunningTime())
					.setProductionCost(m.getProductionCost())
					.setNorthAmericaBoxOffice(m.getNorthAmericaBoxOffice())
					.setWorldBoxOffice(m.getWorldBoxOffice())
					.setKoreanNumberOfAudience(m.getKoreanNumberOfAudience())
					.setRate(m.getRate())
					.setwDate(m.getwDate())
					.setuDate(LocalDateTime.now())
					.build();
			
			dao.update(newMovie);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
