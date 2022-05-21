package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Products;
import com.example.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@GetMapping("/getAllProducts")
	public Object getProducts() {
		return productservice.getAllProducts();
	}
	
	@GetMapping("/getProductbyId/{productId}")
	public Object getProductById(@PathVariable String productId) {
		return productservice.getProductById(productId);
	}
	
	@PostMapping("/addProduct")
	public Object addProduct(@RequestBody Products product) {
		System.out.println("Add prod..");
		return productservice.addProduct(product);
	}
	

}
