package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products,String>{

	

}
