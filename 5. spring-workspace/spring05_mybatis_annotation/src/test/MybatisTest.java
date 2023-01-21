package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import person.Person;
import person.PersonMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class MybatisTest {

	@Autowired
	PersonMapper personMapper;
	
	@Test
	public void test() {
		// assertNotNull(personMapper);
		// personMapper.insertPerson(new Person(0, "죠스바", 15));
		
		// personMapper.deletePerson(3);
		
		// int affectedRows = personMapper.updatePerson(new Person(2, "가렌", 30));
		// System.out.println(affectedRows +"개의 Row(s)가 영향을 받았습니다.");
		
		List<Person> personList = personMapper.selectPersonListSome(2,3);
		for(Person person : personList) {
			System.out.println(person.getName());
		}
		
	}

}
