package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/home")
	public String home() {

		return "Home Page";
	}

	@GetMapping("/getproduct")
	public String product() {

		return restTemplate.getForObject("http://PRODUCT-MICROSERVICE/product", String.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/getproductlist")
	public Map<String, List<String>> productlist() {

		return restTemplate.getForObject("http://PRODUCT-MICROSERVICE/productlist", Map.class);
	}

	@GetMapping("/getprice")
	public String price() {

		return restTemplate.getForObject("http://PRICE-MICROSERVICE/price", String.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/getpricelist")
	public Map<String, String> pricelist() {

		return restTemplate.getForObject("http://PRICE-MICROSERVICE/pricelist", Map.class);
	}
}
