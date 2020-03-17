package kr.ac.eStore.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.eStore.model.Product;
import kr.ac.eStore.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	public ProductService productService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/selectAllOffer", method = RequestMethod.GET)
	public String selectAllOffer(Locale locale, Model model) {
		
		List<Product> productList = productService.getAllProducts();
		model.addAttribute("productList", productList );
		
		return "selectAllOffer";
	}
	
	
}
