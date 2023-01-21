package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	// 컨트롤러가 요청을 받아서 보여줄 화면을 반환
	// 요청받을 맵핑 url을 여기에 적는다.('/hello' url 요청을 받았을 때 보여줄 화면 반환)
	@RequestMapping("/hello")
	public String helloView() {
		
		// String을 보여줄 화면의 경로를 반환한다.
		return "/WEB-INF/view/hello.jsp";
	}
	
	
	@RequestMapping(path = "/hello2", method = RequestMethod.GET)
	public ModelAndView helloMV() {
		ModelAndView mv = new ModelAndView();
		
		//setAttribute와 비슷함
		mv.addObject("greeting", "hello world");
		mv.addObject("number", 100);
		
		mv.setViewName("/WEB-INF/view/hello2.jsp");
		
		return mv;
		
	}
	
}
















