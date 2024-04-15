package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.Product;
import com.ashokit.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/productForm")
	public ModelAndView loadForm() {
		return new ModelAndView("index", "product", new Product());
	}
	
	@PostMapping("/saveProduct")
	public ModelAndView saveProduct(Product product) {
		if(productService.saveProduct(product)) {
			return new ModelAndView("redirect:/allProducts");
		}else {
			return new ModelAndView("index","product",product);
		}
	}
	
	@GetMapping("/allProducts")
	public ModelAndView getAllProducts() {
		 List<Product> products = productService.getProducts();
		 return new ModelAndView("data","products",products);
	}

}
