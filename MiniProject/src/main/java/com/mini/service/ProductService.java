package com.mini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mini.model.Product;


@Service
public interface ProductService {
	Product addProduct(Product product);
    boolean deleteProduct(Integer productId);// throws BookNotFoundException;
    Product getProductById(Integer productId); //throws BookNotFoundException;
    Product updateProduct(Product product);
   
    List<Product> getAllProducts();
    List<Product> getProductbyName(String author) ;
    List<Product> getProductbycategory(String category);
    //List<Product> findByTitleAndAuthor(String title,String name);
    //List<Product> findProductsByTitleAndPrice(String title,Double price);
 
}
