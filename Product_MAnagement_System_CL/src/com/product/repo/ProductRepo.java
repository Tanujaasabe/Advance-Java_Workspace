package com.product.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.product.entity.Product;

public class ProductRepo {
	
	public void createdb(String db) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","System@123");
		PreparedStatement ps=cn.prepareStatement("CREATE DATABASE IF NOT EXISTS " + db);
		  ps.execute();
		System.out.println("db is created");
	}

	public void createtable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		PreparedStatement ps=cn.prepareStatement("CREATE TABLE  product (id INT , name VARCHAR(25), category VARCHAR(25),price DOUBLE,mfgdate VARCHAR(25),expdate VARCHAR(25)");
		ps.execute();
		System.out.println("Table is created");
	
	}
	
	public void inserttable(List<Product>pro) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","System@123");
		PreparedStatement ps=cn.prepareStatement("insert into product(id,name,category,price,mfgdate,expdate) values(?,?,?,?,?,?)");

		for(Product p:pro)
		{
			ps.setLong(1,p.getId());
			ps.setString(2,p.getName());
			ps.setString(3, p.getCategory());
			ps.setDouble(4, p.getPrice());
			ps.setString(5,p.getMfgdate());
			ps.setString(6, p.getExpdate());
			 ps.executeUpdate();
		}
		 
		    System.out.println("inserted successfully");
	    
			
	}
}
