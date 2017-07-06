package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.bus.FizzBuzz;

@Controller
public class FizzBuzzController {
	
	@RequestMapping("/fizzbuzz")
    public String fizzBuzz(@RequestParam(value="n", required=false) Integer number, Model model) {
        if (number == null) {
        	return "fizzbuzz-home";
        }
		
		String answer = FizzBuzz.answerTo(number);
        
        model.addAttribute("number", number);
		model.addAttribute("answer", answer);
        return "fizzbuzz-param";
    }
}
