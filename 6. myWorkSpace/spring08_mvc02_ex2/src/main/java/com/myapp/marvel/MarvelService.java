package com.myapp.marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //@Context -> 시멘틱(의미론적)을 부여하기 위해서
public class MarvelService {
	
	@Autowired
	MarvelMapper marvelMapper;
	
	//조회, 삽입, 수정, 삭제
	
	// 조회하는 서비스 -> 셀렉트로 조회해온 결과를 화면에 보여주면 됨
	public List<Marvel> selectAllMarvel(){
		return marvelMapper.selectAllMarvel();
	}
	
	// 삽입하는 서비스 -> 인서트를 하고 삽입이 잘되었는지 확인!
	public int insertMarvel(Marvel marvel) {
		return marvelMapper.insertMarvel(marvel);
	}
	
	// 수정하는 서비스
	public Marvel selectMarvelById(int marvelId) {
		return marvelMapper.selectMarvelById(marvelId);
	}
	
	public int updateMarvel(Marvel marvel) {
		return marvelMapper.updateMarvel(marvel);
	}
	
	// 삭제하는 서비스
	public int deleteMarvelById(int marvelId) {
		return marvelMapper.deleteMarvelById(marvelId);
	}
	
	
}
