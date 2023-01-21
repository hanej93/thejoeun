package test;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import homework.movie.Movie;
import homework.movie.MovieDao;
import homework.movie.MovieDaoImpl;

public class MovieDBTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MovieDao dao = MovieDaoImpl.getInstance();

		while (true) {

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("=============");
			System.out.println("1. selectWithId");
			System.out.println("2. selectList");
			System.out.println("3. selectWithTitle");
			System.out.println("4. insert");
			System.out.println("5. update");
			System.out.println("6. delete");
			System.out.println("7. selectTotalCount");
			System.out.println("=============");
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("기능을 선택해주세요!");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {
				System.out.println("1. selectWithId 기능을 선택하였습니다.");
				Movie movie = new Movie();
				System.out.println("조회할 아이디를 입력해주세요.");
				movie.setId(Integer.parseInt(sc.nextLine()));
				Movie resultMovie = dao.selectWithId(movie);
				System.out.println(resultMovie);

			}
			if (choice == 2) {
				System.out.println("2. selectList 기능을 선택하였습니다.");
				List<Movie> resultList = dao.selectList();
				System.out.println(resultList);
			}
			if (choice == 3) {
				System.out.println("3. selectWithTitle 기능을 선택하였습니다.");
				System.out.println("영화제목을 입력해주세요.");
				List<Movie> resultList = dao.selectWithTitle(sc.nextLine());
				System.out.println(resultList);
			}
			if (choice == 4) {
				System.out.println("4. insert 기능을 선택하였습니다.");
				Movie movie = new Movie();

				movie.setId(0);

				System.out.println("장르를 입력해주세요.");
				movie.setGenre(sc.nextLine());
				System.out.println("감독을 입력해주세요.");
				movie.setDirector(sc.nextLine());
				System.out.println("각본을 입력해주세요.");
				movie.setScenario(sc.nextLine());
				System.out.println("원작(제목)을 입력해주세요.");
				movie.setTitle(sc.nextLine());
				System.out.println("제작을 입력해주세요.");
				movie.setProducer(sc.nextLine());
				System.out.println("출연(배우)를 입력해주세요.");
				movie.setActor(sc.nextLine());
				System.out.println("음악감독을 입력해주세요.");
				movie.setMusic(sc.nextLine());

				System.out.println("촬영시작일을 입력해주세요. yyyy-MM-dd");
				String str = sc.nextLine();
				if (str.equals("")) {
					movie.setBeginFilming(null);
				} else {
					movie.setBeginFilming(LocalDate.parse(sc.nextLine()));
				}
				System.out.println("촬영종료일을 입력해주세요. yyyy-MM-dd");
				str = sc.nextLine();
				if (str.equals("")) {
					movie.setEndFilming(null);
				} else {
					movie.setEndFilming(LocalDate.parse(sc.nextLine()));
				}

				System.out.println("한국개봉일을 입력해주세요.");
				movie.setReleaseDate(LocalDate.parse(sc.nextLine()));
				System.out.println("상영시간을 입력해주세요.");
				movie.setRunningTime(Integer.parseInt(sc.nextLine()));
				System.out.println("제작비(달러)를 입력해주세요.");
				movie.setProductionCost(Integer.parseInt(sc.nextLine()));
				System.out.println("북미박스오피스를 입력해주세요.");
				movie.setNorthAmericaBoxOffice(Long.parseLong(sc.nextLine()));
				System.out.println("월드박스오피스를 입력해주세요.");
				movie.setWorldBoxOffice(Long.parseLong(sc.nextLine()));

				System.out.println("한국관객수를 입력해주세요.");
				str = sc.nextLine();
				if (str.equals("")) {
					movie.setKoreanNumberOfAudience(0);
				} else {
					movie.setKoreanNumberOfAudience(Integer.parseInt(str));
				}
				System.out.println("등급을 입력해주세요. [\"전체, 12, 15, 19\" 중 입력]");
				movie.setRate(sc.nextLine());
//				System.out.println("작성일을 입력해주세요. yyyy-MM-ddTHH:mm:ss");
//				movie.setwDate(LocalDateTime.parse(sc.nextLine()));
//				System.out.println("수정일을 입력해주세요. yyyy-MM-ddTHH:mm:ss");
//				movie.setuDate(LocalDateTime.parse(sc.nextLine()));

				dao.insert(movie);
			}
			if (choice == 5) {
				System.out.println("5. update기능을 선택하였습니다.");
				Movie movie = new Movie();
				System.out.println("수정할 아이디를 입력해주세요.");
				movie.setId(Integer.parseInt(sc.nextLine()));
				movie = dao.selectWithId(movie);

				String checkUpdate;
				System.out.println("장르를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("장르를 입력해주세요.");
					movie.setGenre(sc.nextLine());
				}

				System.out.println("감독을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("감독을 입력해주세요.");
					movie.setDirector(sc.nextLine());
				}

				System.out.println("각복을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("각본을 입력해주세요.");
					movie.setScenario(sc.nextLine());
				}

				System.out.println("원작(제목)을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("원작(제목)을 입력해주세요.");
					movie.setTitle(sc.nextLine());
				}

				System.out.println("제작을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("제작을 입력해주세요.");
					movie.setProducer(sc.nextLine());
				}

				System.out.println("출연(배우)를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("출연(배우)를 입력해주세요.");
					movie.setActor(sc.nextLine());
				}

				System.out.println("음악감독을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("음악감독을 입력해주세요.");
					movie.setMusic(sc.nextLine());
				}

				System.out.println("촬영시작일을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("촬영시작일을 입력해주세요. yyyy-MM-dd");
					String str = sc.nextLine();
					if (str.equals("")) {
						movie.setBeginFilming(null);
					} else {
						movie.setBeginFilming(LocalDate.parse(sc.nextLine()));
					}
				}

				System.out.println("촬영종료일을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("촬영종료일을 입력해주세요. yyyy-MM-dd");
					System.out.println("엔터시 디폴트");
					String str = sc.nextLine();
					if (str.equals("")) {
						movie.setEndFilming(null);
					} else {
						movie.setEndFilming(LocalDate.parse(sc.nextLine()));
					}
				}

				System.out.println("한국개봉일을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("한국개봉일을 입력해주세요.");
					movie.setReleaseDate(LocalDate.parse(sc.nextLine()));
				}

				System.out.println("상영시간을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("상영시간을 입력해주세요.");
					movie.setRunningTime(Integer.parseInt(sc.nextLine()));
				}

				System.out.println("제작비를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("제작비(달러)를 입력해주세요.");
					movie.setProductionCost(Integer.parseInt(sc.nextLine()));
				}

				System.out.println("북미박스오피스를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("북미박스오피스를 입력해주세요.");
					movie.setNorthAmericaBoxOffice(Long.parseLong(sc.nextLine()));
				}

				System.out.println("월드박스오피스를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("월드박스오피스를 입력해주세요.");
					movie.setWorldBoxOffice(Long.parseLong(sc.nextLine()));
				}

				System.out.println("한국관객수를 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("한국관객수를 입력해주세요.");
					String str = sc.nextLine();
					if (str.equals("")) {
						movie.setKoreanNumberOfAudience(0);
					} else {
						movie.setKoreanNumberOfAudience(Integer.parseInt(str));
					}
				}

				System.out.println("등급을 수정하시겠습니까?");
				System.out.println("수정을 안할 시 엔터");
				checkUpdate = sc.nextLine();
				if (!checkUpdate.equals("")) {
					System.out.println("등급을 입력해주세요. [\"전체, 12, 15, 19\" 중 입력]");
					movie.setRate(sc.nextLine());
				}
				
				dao.update(movie);
			}
			if (choice == 6) {
				System.out.println("6. delete 기능을 선택하였습니다.");
				Movie movie = new Movie();
				dao.delete(movie);
			}
			if (choice == 7) {
				System.out.println("7. selectTotalCount 기능을 선택하였습니다.");
				int count = dao.selectTotalCount();
				System.out.println("영화는 총 " + count + "편 저장되어있습니다.");
			}

		}

	}
}
