package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping("/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "products";
	}

}
