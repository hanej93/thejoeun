package emp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
	
	
	@Select("select *  from employee where hire_date >= #{start} and hire_date < #{end}")
	public List<Employee> selectAllofTheToday(@Param("start") String start,@Param("end") String end);
	
}
