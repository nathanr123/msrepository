package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product")
	public String product() {
		
		
		return "Product Page";
	}
	
	@GetMapping("/productlist")
	public Map<String, List<String>> productlist() {
		
		Map<String, List<String>> products = new HashMap<>();
		
		products.put("products", Arrays.asList("Car","Bus","Train","Ship","Aero Plane"));
		
		return products;
	}
}
