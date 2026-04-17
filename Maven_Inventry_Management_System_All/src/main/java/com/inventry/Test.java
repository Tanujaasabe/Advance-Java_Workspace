package com.inventry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.controller.InventryController;
import com.entity.Inventry;

public class Test {

	public static void main(String[] args) {
		InventryController c=new InventryController();
		
		List<Inventry> list = new ArrayList<>();
		Inventry p1 = new Inventry(1,"Pen","Entity",10,"2026/1/1","2027/1/1",1,1);
		Inventry p2 = new Inventry(2,"Pencil","Entity",5,"2026/2/1","2027/2/1",1,1);
		Inventry p3 = new Inventry(3,"Notebook","Entity",50,"2026/3/1","2027/3/1",1,1);
		Inventry p4 = new Inventry(4,"Eraser","Entity",3,"2026/4/1","2027/4/1",1,1);
		Inventry p5 = new Inventry(5,"Marker","Entity",20,"2026/5/1","2027/5/1",1,1);

		// Add to list
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		//c.addProduct(list);
		
		Inventry ii=new Inventry(1,"pen","entity",10,"2026/1/1","2027/1/1,",2,2);
		
		c.updateByID(1,ii );
		
		c.delete(2, ii);
         
		c.getAllProducts();
		c.fetchproduct(1);
		
	     System.out.println("****category detail****");
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Category: ");
	     String cat = sc.next();
	     c.getProductsByCategory(cat);
			
			
	    System.out.println("*****name ******");
	    System.out.print("Enter name: ");
	    String name= sc.next();
	    c.getProductsByName(name);
		
		
		 System.out.println("*****grater price ******");
		 System.out.print("Enter price: ");
	     double price= sc.nextDouble();
	     c.getProductsPriceGreaterThan(price);
	     
	       
	     System.out.println("*****less price ******");
		 System.out.print("Enter price: ");
	     double priceless= sc.nextDouble();
	     c.getProductsPriceLessThan(priceless);
	     
	       
	       
	      System.out.println("sorted order by asc");
	      c.getProductsOrderByPriceAsc();
	       
	       
	     System.out.println("*****less price ******");
	 	 System.out.print("Enter price minprice: ");
	     double pricemin= sc.nextDouble();
	     System.out.print("Enter price maxprice: ");
	     double pricemax= sc.nextDouble();
	     c.getProductsBetweenPrice(pricemin,pricemax);
	      
	      
	      
	     System.out.println("sorted order by desc ");
	     c.getProductsOrderByPricedesc();
	     
	   
	    System.out.println("*****Warranty ******");
		System.out.print("Enter month: ");
	    int month= sc.nextInt();
	    c.getProductsWithWarrantyGreaterThan(month);
	   
	      
	     c.getAvailableProducts();
	      
		
		System.out.println("*****manufcturing date ******");
	    System.out.print("Enter mfgdate: ");
	    String  mfgdate= sc.next();
	    c.getProductsManufacturedAfter(mfgdate);
	     
	   
		
		 System.out.println("*****expdate date ******");
	     System.out.print("Enter expdate: ");
	     String  expdate= sc.next();
	     c.getProductsExpiringBefore( expdate);
	  
	       
		c.countTotalProducts();
		
		c.getMaxPricedProducts();
		
		c.getAverageProductPrice();
		
		c.getTotalStockCount();
		
		c.getDistinctCategories();
		
		c.getHighestStockProducts();
	    c.getLowStockProducts(5);
	
	}

}
