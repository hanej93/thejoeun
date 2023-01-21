package calcul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calcul")
public class CalculatorController {
	
	
	// /calcul/sum 으로 겟요청을 해야 실행되는 메서드
	@GetMapping("/sum")
	public String sum() {
		return "sumForm";
	}
	
	@GetMapping("/sub")
	public String sub() {
		return "subForm";
	}
	@GetMapping("/mul")
	public String mul() {
		return "mulForm";
	}
	@GetMapping("/div")
	public String div() {
		return "divForm";
	}
	
	
	// form 에서 보내준 name 이름과 파라미터 변수명을 동일하게 해야 함
	// dispatcher 서블릿에서 보내준 모델을 그대로 넘겨줌
	@PostMapping("/sum")
	public String sum (Model m, int num1, int num2) {
		
		int result = num1 + num2;
		
		m.addAttribute("result", result);
		
		return "result";
		
	}
	@PostMapping("/sub")
	public String sub (Model m, int num1, int num2) {
		
		int result = num1 - num2;
		
		m.addAttribute("result", result);
		
		return "result";
		
	}
	@PostMapping("/mul")
	public String mul (Model m, int num1, int num2) {
		
		int result = num1 * num2;
		
		m.addAttribute("result", result);
		
		return "result";
		
	}
	@PostMapping("/div")
	public String div (Model m, int num1, int num2) {
		
		int result = num1 / num2;
		
		m.addAttribute("result", result);
		
		return "result";
		
	}
	
	
	
}
