package com.myapp.marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/marvel")
public class MarvelController {
	
	@Autowired
	MarvelService marvelService;
	
	@GetMapping("/list")
	public String showMarvelList(Model model) {
		
		List<Marvel> marvelList = marvelService.selectAllMarvel();
		
		System.out.println(marvelList);
		
		model.addAttribute("movieList", marvelList);
		
		return "marvelListView";
	}
	
	@GetMapping("/update")
	public String showMarvelUpdateForm(Model model, String titleEng) {
		
		Marvel marvel = marvelService.selectMarvelMovieByTitleEng(titleEng);
		
		model.addAttribute("marvel", marvel);
		
		return "marvelUpdateView";
	}
	
	@PostMapping("/update")
	public String updateMarvel(Marvel marvel) {
		
		int check = marvelService.updateMarvelMovie(marvel);
		
		System.out.println("업데이트확인: " + check);
		return "marvelUpdateProcView";
	}
	
	@GetMapping("/delete")
	public String deleteMarvel(String titleEng) {
		int check = marvelService.deleteMarvelMovie(titleEng);
		
		System.out.println("삭제확인:" + check);
		
		return "marvelDeleteProcView";
	}
	
	@GetMapping("/spec")
	public String showMarvelSpec(Model model, String titleEng) {
		
		MarvelSpec marvelSpec = marvelService.showMarvelSpec(titleEng);
		
		model.addAttribute("marvelSpec", marvelSpec);
		
		return "marvelSpecView";
	}
	
	
}
