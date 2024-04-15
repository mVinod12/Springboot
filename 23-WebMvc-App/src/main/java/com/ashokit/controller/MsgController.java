package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg1() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","welcome to ashokit");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/greet")
	public ModelAndView getMsg2() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Good morning");
		mav.setViewName("index");
		
		return mav;
	}

}
