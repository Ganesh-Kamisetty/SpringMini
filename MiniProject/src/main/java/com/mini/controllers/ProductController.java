package com.mini.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.model.Product;
import com.mini.service.ProductService;
@RestController
@RequestMapping("product-api")
public class ProductController {
	@Autowired
	ProductService productService;
		// TODO Auto-generated constructor stub
		@PostMapping("/products")
		Product addProduct(@RequestBody Product product) {
			return productService.addProduct(product); 
		}
		@DeleteMapping("/delete-by-id/{productId}")
	    boolean deleteProduct(@PathVariable("productId")Integer productId){
			return productService.deleteProduct(productId);
		}// throws BookNotFoundException;
		@GetMapping("/products/{id}")
	    Product getProductById(@PathVariable("id")Integer productId) {
			return productService.getProductById(productId);
		} //throws BookNotFoundException;
		@PutMapping("/products")
	    Product updateProduct(@RequestBody Product product) {
			return productService.updateProduct(product);
		}
	   @GetMapping("/products")
	   List<Product> getAllProducts(){
		   return productService.getAllProducts();
	   }
	   @GetMapping("/search-by-name/{name}")
	   List<Product> getProductbyName(@PathVariable("name")String name){
		   return productService.getProductbyName(name);
	   }
	   @GetMapping("/search-by-category/{category}")
	   List<Product> getProductbycategory(@PathVariable("category")String category){
		   return productService.getProductbycategory(category);
		   
	   }

}
