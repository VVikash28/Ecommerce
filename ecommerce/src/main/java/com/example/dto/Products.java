package com.example.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name = "product_info")
public class Products {
	
	@Id
	private String productId;
	@NotNull(message = "Name is required")
	private String productName;
	private double price;
	private String productUrl;
	
	
	
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Products(String productId, String productName, double price, String productUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productUrl = productUrl;
	}


	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	
	

}
