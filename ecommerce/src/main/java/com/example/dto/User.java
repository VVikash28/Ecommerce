package com.example.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user_info")
public class User {

	@Id
	private String userId;
	@NotNull(message = "Name is required")
	private String userName;
    @OneToMany
    private List<Products> products;
    
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userId, String userName, List<Products> products) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.products = products;
	}

	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
