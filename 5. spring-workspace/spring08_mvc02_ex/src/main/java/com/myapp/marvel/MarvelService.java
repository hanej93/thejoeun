package com.myapp.marvel;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelService {
	
	@Autowired
	MarvelMapper marvelMapper;
	
	public List<Marvel> selectAllMarvel() {
		
		List<Marvel> marvelList = marvelMapper.selectAllMarvel();
		
		return marvelList;
	}
	
	public Marvel selectMarvelMovieByTitleEng(String titleEng) {
		
		return marvelMapper.selectMarvelbyTitleEng(titleEng);
	}
	
	public int updateMarvelMovie(Marvel movie) {
		
		movie.setUpdateDate(LocalDateTime.now());
		
		return marvelMapper.updateMarvelMovie(movie);
	}
	
	
	public int deleteMarvelMovie(String titleEng) {
		
		return marvelMapper.deleteMarvelMovieByTitleEng(titleEng);		
	}
	
	
	public MarvelSpec showMarvelSpec(String titleEng) {
		
		String title = marvelMapper.selectMarvelbyTitleEng(titleEng).getTitle();
		
		return marvelMapper.selectMarvelSpecByTitle(title);
		
	}
	
}
