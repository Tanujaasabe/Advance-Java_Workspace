package com.product1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.product.controller.ProductContoller;
import com.product.entity.Product;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductContoller c=new ProductContoller();
		c.createdb("productdb");
		c.createtable();
		
		
		
		List<Product>list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many product add");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the id");
			int id=sc.nextInt();
			 sc.nextLine();
			
			System.out.println("enter name");
			String name=sc.nextLine();
			
			System.out.println("enter category");
			String category=sc.nextLine();
			
			System.out.println("enter price");
			double price=sc.nextDouble();
			 sc.nextLine();
			
			System.out.println("enter mgfdate");
			String mfgdate=sc.nextLine();
			
			System.out.println("enter expdate");
			String expdate=sc.nextLine();
			
			Product p=new Product(id,name,category,price,mfgdate,expdate);
			list.add(p);
	}
		
		c.inserttable(list);
	}
}
