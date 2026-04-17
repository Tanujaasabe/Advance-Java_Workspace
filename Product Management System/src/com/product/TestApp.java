package com.product;

import com.product.controller.ProductController;

public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("***** Welocme to Product App ***********");

		ProductController pc = new ProductController();

		//pc.getAllProducts();
		
		//pc.getProductByName("rice");

	    pc.getProductByCategory("Grocery");
	   // pc.getByAscPrice();
	    
	   // pc.getProductById(2);
	}

}
