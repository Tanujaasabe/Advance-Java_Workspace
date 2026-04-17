package com.product.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.product.entity.Product;
import com.product.repo.ProductRepo;

public class Productservice {
	
	ProductRepo r=new ProductRepo(); 
	
	public void createdb(String db) throws ClassNotFoundException, SQLException
	{
		r.createdb(db);
	}
	
	public void createtable() throws ClassNotFoundException, SQLException {
		r.createtable();
	}
	
	public void inserttable(List<Product> list2) throws ClassNotFoundException, SQLException
	{
		
		List<Product>list=new ArrayList<>();
		 
		for (Product p : list2) {
            if (p.getPrice() <= 0) {
                System.out.println("Invalid price for product: " + p.getName());
                return;
            }
        }
		
		r.inserttable(list2);
	}
	
	}


