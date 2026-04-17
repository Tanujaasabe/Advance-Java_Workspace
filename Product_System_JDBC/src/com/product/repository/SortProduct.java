package com.product.repository;

import java.util.Comparator;

import com.product.entity.Product;

public class SortProduct implements Comparator<Product>{

	@Override
	 public int compare(Product p1, Product p2) {

        return Double.compare(p1.getPrice(), p2.getPrice());

    }

}
