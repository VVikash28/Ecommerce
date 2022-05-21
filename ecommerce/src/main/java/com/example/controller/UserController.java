package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Products;
import com.example.dto.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userservice;
	
	@GetMapping("/getAllUserDetails/{userId}")
	public Object getProducts(@PathVariable String userId) {
		return userservice.getAllDetailsById(userId);
	}
	
	@PostMapping("/addUser")
	public Object addProduct(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@PostMapping("/addUser/{userId}")
	public Object addProduct(@RequestBody Products prod, @PathVariable String userId) {
		return userservice.addproducttoUser(prod,userId);
	}
	
}
