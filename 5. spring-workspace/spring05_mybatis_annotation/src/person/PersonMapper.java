package person;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonMapper {
	// mybatis annotation 방식으로 쿼리문 작성하기
	
	@Insert("insert into person values(#{id}, #{name}, #{age})")
	void insertPerson(Person person);
	
	@Delete("delete from person where id = #{id}")
	void deletePerson(int id);
	
	@Update("update person set name=#{name}, age=#{age} where id=#{id}")
	int updatePerson(Person person);
	
	@Select("select * from person")
	List<Person> selectPersonList();
	
	// 메서드 명을 key로 저장하기 때문에 메서드 오버로딩이 안되는듯??
	@Select("select * from person limit #{startRow}, #{cnt}")
	List<Person> selectPersonListSome(@Param("startRow") int startRow, @Param("cnt") int cnt);
}
