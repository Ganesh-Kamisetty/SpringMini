package com.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.dao.ProductRepository;
import com.mini.exceptions.ProductNotFoundException;
import com.mini.model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Product newProduct=productRepository.save(product);
		return newProduct;
		
	}

	@Override
	public boolean deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
		return true;
	}

	@Override
	public Product getProductById(Integer productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId)
		.orElseThrow(()-> new ProductNotFoundException("Id not available"));
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductbyName(String author) {
		// TODO Auto-generated method stub
		return   productRepository.findByProductName(author);
	}

	@Override
	public List<Product> getProductbycategory(String category) {
		// TODO Auto-generated method stub
		return  productRepository.findByCategoryOrderByPriceAsc(category);
	}

}
