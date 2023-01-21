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
import person.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class MybatisTest {

	@Autowired
	PersonMapper personMapper;
	
	@Autowired
	PersonService personService;
	
	@Test
	public void test() {
//		assertNotNull(personMapper);
//		assertNotNull(personService);
//		List<Person> personList = personMapper.selectPersonList();
//		
//		for(Person person : personList) {
//			System.out.println(person);
//		}
		personService.modifyPerson();
		
	}

}
