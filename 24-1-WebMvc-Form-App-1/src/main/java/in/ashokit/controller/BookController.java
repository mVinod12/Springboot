package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.Book;

@Controller
public class BookController {

	
	// to load the form 
	@GetMapping("/book")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookObj",new Book());
		mav.setViewName("bookView");
		return mav;
	}
	
	@PostMapping("/book")
	public ModelAndView handleBookSubmit(Book book) {
		System.out.println(book);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Book saved Successfully..book.");
		mav.setViewName("sucess");
		return mav;
	}
}
