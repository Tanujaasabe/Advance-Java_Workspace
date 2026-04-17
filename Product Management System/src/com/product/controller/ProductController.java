package com.product.controller;

import java.util.List;

import com.product.entity.Product;
import com.product.service.ProductService;

public class ProductController {   // API

	ProductService ps = new ProductService();

	public void getAllProducts() {

		List<Product> allProducts = ps.getAllProducts();

		for (Product prod : allProducts) {
			System.out.println(prod);
		}
	}

	public void getProductByName(String name) {
		
		Product productByName = ps.getProductByName(name);
		
		System.out.println(productByName);
	}
	
	
	
	
	public void getProductByCategory(String category) {

	    List<Product> productsByCategory = ps.getProductByCategory(category);

	    if (productsByCategory.isEmpty()) {
	        System.out.println("No Products Found In This Category");
	    } else {

	        for (Product prod : productsByCategory) {
	            System.out.println(prod);
	        }
	    }
	}
	
	
	
	public void getByAscPrice() {

	    List<Product> sortedProducts = ps.getByAscPrice();

	    for (Product prod : sortedProducts) {
	        System.out.println(prod);
	    }
	}

	
	
	public void getProductById(long id) {

	    Product productById = ps.getProductById(id);

	    if (productById != null) {
	        System.out.println(productById);
	    } else {
	        System.out.println("Product Not Found");
	    }
	}


	
	

	
}
