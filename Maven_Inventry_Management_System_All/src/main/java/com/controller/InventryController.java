package com.controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Inventry;
import com.service.InventryService;

public class InventryController {
	
	InventryService s=new InventryService();
	
	
	private void printProduct(Inventry inv)
	{
	    System.out.println("--------------------");
	    System.out.println("ID: " + inv.getId());
	    System.out.println("Name: " + inv.getName());
	    System.out.println("Category: " + inv.getCategory());
	    System.out.println("Price: " + inv.getPrice());
	    System.out.println("MfgDate"+inv.getManufacturingdate());
	    System.out.println("Warranty: " + inv.getWarranty());
	    System.out.println("Quantity: " + inv.getQuality());
	}

	
	
	public void addProduct(List<Inventry> list)
	{
		
		 s.addProduct(list);
	}

	
	public int updateByID(int id,Inventry inv)
	{
		return s.updateByID(id,inv);
	}
	
	public int delete(int id,Inventry inv)
	{
		return s.delete(id,inv);
	}
	
	
	public  List<Inventry> getAllProducts()
	{
		   
		   List<Inventry> list = s.getAllProducts();

			for(Inventry inv : list)
			{
//				System.out.println("--------------------");
//			    System.out.println("ID: " + inv.getId());
//			    System.out.println("Name: " + inv.getName());
//			    System.out.println("Category: " + inv.getCategory());
//			    System.out.println("Price: " + inv.getPrice());
//			    System.out.println("Warranty: " + inv.getWarranty());
//			    System.out.println("Quantity: " + inv.getQuality());
				
				printProduct(inv);
			}
			return list;
	}

	public List<Inventry> getProductsByCategory(String category)
	{
		
		List<Inventry> list = s.getProductsByCategory(category);

		if(list.isEmpty())
		{
		    System.out.println("No Product Found");
		}
		else
		{
		    for(Inventry inv : list)
		    {
		    	printProduct(inv);
		    }
		}
		return list;


	}
	
	public List<Inventry> getProductsByName(String name)
	{
		List<Inventry>list=s.getProductsByName(name);
		for(Inventry inv : list)
	    {
			printProduct(inv);
	    }
		return list;
		
	}
	
	public Inventry fetchproduct(int id) {
		
        Inventry inv=s.fetchproduct(id);
		
		if(inv !=null)
		{
			printProduct(inv);
 
		}
		else
		{
			    System.out.println("Product Not Found!");
		}
		return inv;
		
	}
	
	
	 public List<Inventry> getProductsPriceGreaterThan(double price)
	 {
		 List<Inventry>list= s.getProductsPriceGreaterThan(price);
		 
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
	 }
	 
	 public List<Inventry> getProductsPriceLessThan(double price)
	 {
		 List<Inventry>list= s.getProductsPriceLessThan(price);
		 
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
	 }
	 
	 
	 
	 public List<Inventry> getProductsBetweenPrice(double minPrice, double maxPrice)
	 {
        List<Inventry>list= s.getProductsBetweenPrice( minPrice,  maxPrice);
		 
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
	 }
	 
	 
	 
	 public List<Inventry> getProductsOrderByPriceAsc()
	 {
		 List<Inventry>list=s.getProductsOrderByPriceAsc();
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
		 
	 }
	 
	 
	 
	 public List<Inventry> getProductsOrderByPricedesc()
	 {
		 List<Inventry>list=s.getProductsOrderByPricedesc();
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
		 
	 }
	 
	 public List<Inventry> getProductsWithWarrantyGreaterThan(int months)
	 {
		 List<Inventry>list=s.getProductsOrderByPricedesc();
		 for(Inventry inv : list)
		    {
			 printProduct(inv);
		    }
			return list;
	 }
	 
	 
	 
	 public void getAvailableProducts()
	 {
		List<Inventry>list=s.getAvailableProducts();
		
		 if(list.isEmpty())
		    {
		        System.out.println("No Products Available In Stock");
		    }
		 else
		 {
			 
			for(Inventry inv:list)
			{
				printProduct(inv);
			}
	    }
		
	  }
	 
	 
	 public void getProductsManufacturedAfter(String mfgDate) {
		 List<Inventry>list=s.getProductsManufacturedAfter(mfgDate);
		  if(list.isEmpty())
		  {
			  System.out.println("product available nahi hai!!!!!!");
		  }
		  else
		  {
			  for(Inventry inv:list)
			  {
				  printProduct(inv);
			  }
		  }
		  
	 }
	 
	 
	 
	 public void getProductsExpiringBefore(String expDate)
	  {
		 List<Inventry>list=s.getProductsExpiringBefore(expDate);
		  if(list.isEmpty())
		  {
			  System.out.println("product available nahi hai!!!!!!");
		  }
		  else
		  {
			  for(Inventry inv:list)
			  {
				  printProduct(inv);
			  }
		  }
		  
	  }
	 
	 public void countTotalProducts()
	 {
	     Long total = s.countTotalProducts();

	     System.out.println("Total Products In Inventory: " + total);
	 }

	 
	 public void getMaxPricedProducts()
	 {
	    double max= s.getMaxPricedProducts();
	    System.out.println(max);

	 }

	 
	 public  void getAverageProductPrice() 
	  {
		 double avg= s.getAverageProductPrice();
		 System.out.println(avg);
	  }
	 
	 
	 public void getTotalStockCount()
	 {
	     Long stock = s.getTotalStockCount();

	     System.out.println("Total Stock Available: " + stock);
	 }
	 
	 public void getDistinctCategories()
	 {
	     List<String> list = s.getDistinctCategories();

	     if(list.isEmpty())
	     {
	         System.out.println("No Categories Found");
	     }
	     else
	     {
	         System.out.println("---- Product Categories ----");
	         for(String cat : list)
	         {
	             System.out.println(cat);
	         }
	     }
	 }

	 
	 public void getHighestStockProducts()
	 {
	     List<Inventry> list = s.getHighestStockProducts();

	     if(list.isEmpty())
	     {
	         System.out.println("No Products Found");
	     }
	     else
	     {
	         System.out.println("---- Highest Stock Products ----");

	         for(Inventry inv : list)
	         {
	             printProduct(inv);
	             System.out.println("Stock: " + inv.getQuality());
	         }
	     }
	 }


	 
	 public void getLowStockProducts(int threshold)
	 {
	     List<Inventry> list = s.getLowStockProducts(threshold);

	     if(list.isEmpty())
	     {
	         System.out.println("No Low Stock Products (Threshold: " + threshold + ")");
	     }
	     else
	     {
	         System.out.println("---- Low Stock Products (Threshold: " + threshold + ") ----");

	         for(Inventry inv : list)
	         {
	             printProduct(inv);
	             System.out.println("Stock: " + inv.getQuality());
	         }
	     }
	 }

	 
}


