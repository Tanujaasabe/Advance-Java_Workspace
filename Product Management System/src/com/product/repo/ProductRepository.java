package com.product.repo;

import java.util.ArrayList;
import java.util.List;

import com.product.entity.Product;

public class ProductRepository {

	// connected to databases  

	public List<Product> getAllProducts() {
		
		List<Product> products = new ArrayList<>();

		products.add(new Product(101, "Milk", "Dairy", 45.50, "2025-01-01", "2025-01-10"));
		products.add(new Product(102, "Bread", "Bakery", 30.00, "2025-01-02", "2025-01-07"));
		products.add(new Product(103, "Butter", "Dairy", 120.75, "2024-12-20", "2025-02-20"));
		products.add(new Product(104, "Rice", "Grocery", 60.00, "2024-10-10", "2026-10-10"));
		products.add(new Product(105, "Sugar", "Grocery", 42.00, "2024-11-15", "2026-11-15"));
		products.add(new Product(106, "Soap", "Personal Care", 35.00, "2024-09-01", "2027-09-01"));
		products.add(new Product(107, "Shampoo", "Personal Care", 180.00, "2024-08-05", "2026-08-05"));
		products.add(new Product(108, "Toothpaste", "Personal Care", 95.00, "2024-07-20", "2026-07-20"));
		products.add(new Product(109, "Biscuits", "Snacks", 25.00, "2025-01-05", "2025-06-05"));
		products.add(new Product(110, "Juice", "Beverages", 55.00, "2025-01-03", "2025-04-03"));

		return products;
	}
}
