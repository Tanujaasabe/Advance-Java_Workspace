package com.product.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.product.entity.Product;

public class ProductRepository {
	
	public void createdb(String db) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","System@123");
		PreparedStatement ps=cn.prepareStatement("CREATE DATABASE IF NOT EXISTS "+ db);
		ps.execute();
		System.out.println("database created ");
	}
	
	public void createtable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		PreparedStatement ps=cn.prepareStatement("CREATE TABLE IF NOT EXISTS product(id INT,name varchar(25),category varchar(25),price double,mfgdate varchar(25),expdate varchar(25))");
		ps.execute();
		System.out.println("table is created");	
	}
	
	public void insertdata(List<Product>pro) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		PreparedStatement ps=cn.prepareStatement("insert into product(id,name,category,price,mfgdate,expdate) values(?,?,?,?,?,?)");
		
		for(Product p:pro)
		{
			ps.setInt(1,p.getId());
			ps.setString(2, p.getName());
			ps.setString(3,p.getCategory());
			ps.setDouble(4, p.getPrice());
			ps.setString(5,p.getMfgdate() );
			ps.setString(6, p.getExpdate());
			
			ps.executeUpdate();
		}
		
		System.out.println("inserted successfully");
	}

	
	public void showtable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		Statement st=cn.createStatement();
		
		ResultSet rs=st.executeQuery("select *From product");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
		
	}

	public void productById(int id) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		PreparedStatement ps=cn.prepareStatement("select * from product where id=?");
		ps.setInt(1,id);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
			
	}
	
	
	public void productByName(String name) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		PreparedStatement ps=cn.prepareStatement("select * from product where name=?");
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
			
	}
	
	public void sortByprice() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","System@123");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM product ORDER BY price ASC");

	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5)+" "+rs.getString(6));
	    
	    }
	    
		System.out.println("sorted data");
	}
	

}
