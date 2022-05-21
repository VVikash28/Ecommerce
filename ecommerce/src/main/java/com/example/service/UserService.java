package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Products;
import com.example.dto.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public Object getAllDetailsById(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	public Object addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	public Object addproducttoUser(Products product, String userId) {
		User user = userRepository.findById(userId).get();
		List<Products> prods = user.getProducts();
		prods.add(product);
		return userRepository.save(user);
	}
}
