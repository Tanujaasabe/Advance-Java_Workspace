package com.product.service;

import java.sql.SQLException;
import java.util.List;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

public class PRoductservice {
	
	ProductRepository r=new ProductRepository();
	public void createdb(String db) throws ClassNotFoundException, SQLException
	{
		r.createdb(db);
	}

	public void createtable() throws ClassNotFoundException, SQLException
	{ 
		r.createtable();
	}
	
	public void insertdata(List<Product>pro)
	{
		try
		{
			r.insertdata(pro);
		}
		catch(Exception e )
		{
			 System.out.println("❌ Error While Batch Insert");
	          e.printStackTrace();
		}
	}
	public void showdata() throws ClassNotFoundException, SQLException
	{
			r.showtable();

	}
	
	public void productById(int id) throws ClassNotFoundException, SQLException
	{
		try {
			
			r.productById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void productByName(String name) throws ClassNotFoundException, SQLException {
		r.productByName(name);
	}
	
	public void sortByprice() throws ClassNotFoundException, SQLException
	{
		r.sortByprice();
	}
	

}
