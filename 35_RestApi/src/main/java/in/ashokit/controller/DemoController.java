package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/greet")
	public String getGreetMsg(@RequestParam("name") String name) {
		
		String msg =   name+ "Good Morning...";
		return msg;
		
	}
	    
	  @GetMapping("/welcome/{name}")
       public String getWelcomeMsg(@PathVariable("name") String name) {
		
		String msg =  name+ "welcome to AshokIt...";
		
		return msg;
		
	}

}
