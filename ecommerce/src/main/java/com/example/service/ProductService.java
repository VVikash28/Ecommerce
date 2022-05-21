package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Products;
import com.example.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public Object getAllProducts() {
		if(productRepository.count()==0)
		{
			return "No product exists in the database";
		}
		return (List<Products>) productRepository.findAll();
	}

	public Object getProductById(String productId) {
		if (!productRepository.existsById(productId)) 
		{
			return "Product with Id " + productId + " Not Found";
		}
		return productRepository.findById(productId);
	}

	public Object addProduct(Products product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	

}
