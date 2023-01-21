package com.myapp.marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MarvelMapper {
	
	//조회, 삽입, 수정, 삭제
	
	@Select("select * from marvel_movie")
	public List<Marvel> selectAllMarvel();
	
	
	@Insert("insert into marvel_movie values(#{marvelId}, "
			+ "#{title}, #{titleEng}, #{releaseDate},  #{worldBoxOffice}, #{writeDate}, #{updateDate} )")
	@Options(useGeneratedKeys = true, keyProperty = "marvelId")
	public int insertMarvel(Marvel marvel);
	
	// 수정하기 위해 필요한 메서드
	
	// 수정할 데이터를 가져옴
	@Select("select * from marvel_movie where marvel_id = #{marvelId}")
	public Marvel selectMarvelById(int marvelId);
	
	// 가져온 데이터를 수정
	@Update("update marvel_movie set title=#{title}, title_eng=#{titleEng}, "
			+ "release_date=#{releaseDate},  world_box_office=#{worldBoxOffice}, write_date=#{writeDate}, update_date=#{updateDate} "
			+ "where marvel_id = #{marvelId}")
	public int updateMarvel(Marvel marvel);
	
	@Delete("delete from marvel_movie where marvel_id = #{marvelId}")
	public int deleteMarvelById(int marvelId);
	
}
