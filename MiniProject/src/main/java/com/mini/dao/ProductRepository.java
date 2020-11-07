package com.mini.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.mini.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer>{

	//public ProductRepository() {
		// TODO Auto-generated constructor stub
	List<Product> findByProductName(String name);
	List<Product> findByCategoryOrderByPriceAsc(String category);
	
	}


