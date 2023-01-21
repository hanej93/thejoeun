package person;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component를 시멘틱하게 정의
@Service
public class PersonService {

	@Autowired
	PersonMapper personMapper;
	Scanner sc;
	
	public PersonService() {
		this.sc = new Scanner(System.in);
	}
	
	
	public void choiceMenu() {

		int num;
		while(true) {
			System.out.println("==================");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보수정");
			System.out.println("3. 회원정보삭제");
			System.out.println("4. 회원정보조회(아이디)");
			System.out.println("==================");
			
			try {
				num = Integer.parseInt(sc.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("유효한 숫자를 입력바랍니다.");
			}
		}
		
		if (num == 1) {
			// 회원가입
			this.signUp();
		} else if (num == 2) {
			// 회원정보수정
			this.modifyPerson();
		} else if (num == 3) {
			// 회원정보삭제
		} else if (num == 4) {
			// 회원정보조회(아이디)
		} else {
			
		}

	}
	
	public void modifyPerson() {
		System.out.println("수정할 아이디 입력 바람");
		String userId = sc.next();
		
		System.out.println("나이 입력 바람");
		int age = Integer.parseInt(sc.next());
		
		
//		System.out.println(personMapper.selectPersonByNameAndAge(sc.next()));
		
	}


	private void signUp() {	
		
		Person person = new Person();
		
		
		System.out.println("회원가입을 선택하셨습니다.");
		System.out.println("이름을 입력해주세요.");
		person.setName(sc.next());
		while(true) {
			System.out.println("나이를 입력해주세요.");
			try {
				person.setAge(Integer.parseInt(sc.next()));
				break;
			} catch (NumberFormatException e) {
				System.out.println("유효한 숫자를 입력바랍니다.");
			}
		}
		personMapper.insertPerson(person);
		System.out.println("회원가입이 완료되었습니다.");
	}
	

	public void insertUser(Person person) {
		personMapper.insertPerson(person);
	}

	public void updateUser(Person person) {
		personMapper.updatePerson(person);
	}

}
