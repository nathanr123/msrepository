package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

	@GetMapping("/price")
	public String product() {

		return "Price Page";
	}

	@GetMapping("/pricelist")
	public Map<String, String> pricelist() {

		Map<String, String> products = new HashMap<>();

		products.put("Car", "12 Lakhs");
		products.put("Bus", "60 Lakhs");
		products.put("Train", "60 Crore");
		products.put("Ship", "100 Crore");
		products.put("Aero Plane", "150 Crore");

		return products;
	}
}
