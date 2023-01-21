package spring08_mvc02_ex;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.marvel.Marvel;
import com.myapp.marvel.MarvelMapper;
import com.myapp.marvel.MarvelService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/WEB-INF/spring/root_context.xml")
public class MarvelTest {

	@Autowired
	MarvelMapper marvelMapper;
	
	@Autowired
	MarvelService marvelService;
	
	@Test
	public void test() {
		
		List<Marvel> marvelList = marvelMapper.selectAllMarvel();
		
		for (Marvel marvel : marvelList) {
			System.out.println(marvel);
		}
		
	}

}
