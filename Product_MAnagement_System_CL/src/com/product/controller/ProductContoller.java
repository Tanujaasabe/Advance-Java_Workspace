package com.product.controller;

import java.sql.SQLException;
import java.util.List;

import com.product.entity.Product;
import com.product.service.Productservice;

public class ProductContoller {
	
	Productservice s=new Productservice();
	
	public void createdb(String db) throws ClassNotFoundException, SQLException
	{
		s.createdb(db);
	}

	
	public void createtable() throws ClassNotFoundException, SQLException {
		s.createtable();
	}
	

	
	
    public void inserttable(List<Product> list) throws ClassNotFoundException, SQLException {

    	try {
    	    s.inserttable(list);
    	} catch (ClassNotFoundException | SQLException e) {
    	    e.printStackTrace(); // Database errors
    	}
       
    }
}
