package day0415MarvelMovie;

public class BuilderTest {
	public static void main(String[] args) {
		// Movie 객체를 만들어볼 것임
		
		// Movie movie = new Movie(builder); // 이렇게 직접 객체를 만들지 못함
		
		
		// Movie는 builder라는 아이를 통해서만 객체 생성이 가능하며
		// 객체 내부의 필드의 수정이 안된다.
		// 이 객체는 불변의 객체다. immutable한 객체이다.
		// 빌더 패턴
//		Movie.Builder builder = new Movie.Builder();
//		builder.setTitle("아이언맨");
//		Movie movie = builder.build();
		
		Movie movie = new Movie.Builder()
				.setTitle("아이언맨")
				.setGenre("슈퍼히어로")
				.build();
		
		
	}
}
