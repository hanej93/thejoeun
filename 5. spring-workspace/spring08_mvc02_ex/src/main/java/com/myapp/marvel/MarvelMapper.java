package com.myapp.marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MarvelMapper {

	// 조회 메서드
	@Select("select marvel_id, title, title_eng, release_date, world_box_office, write_date, update_date "
			+ "from marvel_movie")
	public List<Marvel> selectAllMarvel();
	
	// 삽입 메서드
	
	// 수정 메서드
	// 아이디로 조회
	@Select("select marvel_id, title, title_eng, release_date, world_box_office, write_date, update_date "
			+ "from marvel_movie where title_eng = #{titleEng}")
	public Marvel selectMarvelbyTitleEng(String titleEng);
	
	@Update("update marvel_movie set title=#{title}, title_eng=#{titleEng}, release_date=#{releaseDate}, world_box_office=#{worldBoxOffice}, write_date=#{writeDate}, update_date=#{updateDate} "
			+ " where marvel_id = #{marvelId}")
	public int updateMarvelMovie(Marvel marvel);
	
	// 삭제 메서드
	@Delete("delete from marvel_movie where title_eng = #{titleEng}")
	public int deleteMarvelMovieByTitleEng(String titleEng);
	
	
	// 상세보기
	@Select("select * from movie where title = #{title}")
	public MarvelSpec selectMarvelSpecByTitle (String title);
	
}
