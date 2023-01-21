package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@RequestMapping(path= "/show/gugu")
	public ModelAndView gugu() {
		ModelAndView mv = new ModelAndView();
		
		List<String> danList = new ArrayList<String>();
		
		for (int i = 2; i <= 9; i++) {
			String dan = i +"단<br>";
			dan += "------------------------<br>";
			for (int j = 1; j <= 9; j++) {
				dan += i +" x " + j + " = " + i*j + "<br>";
			}
			danList.add(dan);
		}
		
		mv.addObject("gugu", danList);
		
		mv.setViewName("/WEB-INF/view/gugudan.jsp");
		
		return mv;
	}
	
	@RequestMapping(path= "/show/food")
	public ModelAndView food() {
		ModelAndView mv = new ModelAndView();
		
		List<String> foodList = new ArrayList<String>();
		
		foodList.add("라면");
		foodList.add("김밥");
		foodList.add("쫄면");
		
		mv.addObject("food", foodList);
		
		mv.setViewName("/WEB-INF/view/foodlist.jsp");
		
		return mv;
		
	}
	
}
