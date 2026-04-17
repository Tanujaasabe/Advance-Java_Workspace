package com.product.service;

import java.util.ArrayList;

import java.time.LocalDate;

import java.util.List;

import com.product.entity.Product;
import com.product.repo.ProductRepository;

public class ProductService {

	ProductRepository pr = new ProductRepository();

	public List<Product> getAllProducts() {

		List<Product> allProducts = pr.getAllProducts();

		return allProducts;
	}

	public Product getProductByName(String name) {

		Product probyname = new Product();

		for (Product pro : pr.getAllProducts()) {

			if (pro.getName().equalsIgnoreCase(name)) {
				probyname = pro;

			}
		}

		return probyname;

	}
	
	public List<Product> getProductByCategory(String category) {

	    List<Product> categoryList = new ArrayList<>();

	    for (Product pro : pr.getAllProducts()) {

	        if (pro.getCategory().equalsIgnoreCase(category)) {
	            categoryList.add(pro);
	        }
	    }

	    return categoryList;
	}


	
	public List<Product> getByAscPrice() {

	    List<Product> productList = pr.getAllProducts();

	    productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

	    return productList;
	}

	
	public Product getProductById(long id){
		for(Product p:pr.getAllProducts())
		{
			if(p.getId()==id)
			{
				 return p;
			}
		}
		return null;
	}
		
	
	


}
