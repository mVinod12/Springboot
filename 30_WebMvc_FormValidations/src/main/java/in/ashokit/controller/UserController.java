package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
		
	}
	
	@PostMapping("/user")
	public String handleSubmit(User user,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}else {
			System.out.println(user);
			model.addAttribute("msg", "user saved");
			return "index";
		}
	}
}
		
		

