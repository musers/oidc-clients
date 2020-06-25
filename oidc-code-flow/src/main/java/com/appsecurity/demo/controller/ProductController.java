package com.appsecurity.demo.controller;

import com.appsecurity.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Espresso"));
		list.add(new Product("Cappuccino"));
		list.add(new Product("Latte"));
		return list;
	}

}
