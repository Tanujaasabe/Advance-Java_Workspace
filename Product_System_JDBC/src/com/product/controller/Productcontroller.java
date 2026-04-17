package com.product.controller;

import java.sql.SQLException;
import java.util.List;

import com.product.entity.Product;
import com.product.service.PRoductservice;

public class Productcontroller {
	
	PRoductservice s=new PRoductservice();
	
	public void createdb( String db) throws ClassNotFoundException, SQLException
	{
		s.createdb(db);
	}

	public void createtable() throws ClassNotFoundException, SQLException
	{
		s.createtable();
	}
	
	public void insertdata(List<Product> pro)
	{
		s.insertdata(pro);
	}
	
	public void showdata() throws ClassNotFoundException, SQLException
	{
	
			s.showdata();
		
	}
	
	public void productById(int id) throws ClassNotFoundException, SQLException
	{
		try {
			s.productById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
     }
	
	public void productByName(String name) throws ClassNotFoundException, SQLException {
		s.productByName(name);
	}
	
	public void sortByprice() throws ClassNotFoundException, SQLException
	{
		s.sortByprice();
	}
	
}