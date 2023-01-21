//아무예시나 위와 비슷한형태의 클래스를 만들어보고
//템플릿패턴을 사용하는 형태로 변경해보는 과정을 직접 다시 작성!!

package day0317.cook;

public abstract class Cook {
	protected String name;
	protected Cut cut;
	protected Feel feel;

	public void cooking() {
		System.out.println("요리 시작");
		System.out.println("재료를 씻는다");
		cut();
		System.out.println("육수를 끓인다");
		feel();
		System.out.println("재료를 넣는다");
		feel();
		System.out.println("요리 끝");
	}

	public void feel() {
		feel.feel();
	}
	public void cut() {
		cut.cut();
	}
}
