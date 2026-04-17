package com.service;

import java.util.List;

import com.entity.Inventry;
import com.repository.InventryRepo;


public class InventryService {
	
	InventryRepo r=new InventryRepo();
	
	
	public void addProduct(List<Inventry> list) {
		
	  r.addProduct(list);
	
	}
	
	public int updateByID(int id,Inventry inv)
	{
		return r.updateByID(id, inv);
	}
	
	
	public int delete(int id,Inventry inv) {
		return r.delete(id,inv);
	}
	
	public  List<Inventry> getAllProducts()
	{
		
		return r.getAllProducts();
	}
	
	
	
	public Inventry fetchproduct(int id)
	{
		return r.fetchproduct(id);
	}
	
	public List<Inventry> getProductsByCategory(String category)
	{
		 return r.getProductsByCategory(category);

	}
	
	
	 public List<Inventry> getProductsByName(String name) 
	 {
		 return r.getProductsByName(name);
	 }
	 
	
	 public List<Inventry> getProductsPriceGreaterThan(double price)
	 {
		 return r.getProductsPriceGreaterThan(price);
	 }
	 
	 public List<Inventry> getProductsPriceLessThan(double price)
	 {
		 return r.getProductsPriceLessThan(price);
	 }
	 
	 public List<Inventry> getProductsBetweenPrice(double minPrice, double maxPrice)
	 {
		 return r.getProductsBetweenPrice(minPrice, maxPrice);
	 }
	 
	 public List<Inventry> getProductsOrderByPriceAsc()
	 {
		 return r.getProductsOrderByPriceAsc();
	 }

	 public List<Inventry> getProductsOrderByPricedesc()
	 {
		 return r.getProductsOrderByPricedesc();
	 }
	 
	 public List<Inventry> getProductsWithWarrantyGreaterThan(int months)
	 {
		 return r.getProductsWithWarrantyGreaterThan(months);
	 }
	 
	 public List<Inventry> getAvailableProducts()
	 {
		 return r.getAvailableProducts();
	 }
	 

	  public List<Inventry> getProductsManufacturedAfter(String mfgDate) {
		return r.getProductsManufacturedAfter(mfgDate);
	  }
	  public List<Inventry> getProductsExpiringBefore(String expDate)
	  {
		  return r.getProductsExpiringBefore(expDate);
	  }
	  
	  public Long countTotalProducts()
	  {
		  return r.countTotalProducts();
	  }
	  
	  public double getMaxPricedProducts()
	  {
	      return r.getMaxPricedProducts();
	  }

	  public  Double getAverageProductPrice() 
	  {
		  return r.getAverageProductPrice();
	  }
	  
	  public Long getTotalStockCount()
	  {
	      return r.getTotalStockCount();
	  }
	  
	  public List<String> getDistinctCategories()
	  {
	      return r.getDistinctCategories();
	  }

	  
	  public List<Inventry> getHighestStockProducts()
	  {
	      return r.getHighestStockProducts();
	  }

	  
	  public List<Inventry> getLowStockProducts(int threshold)
	  {
	      return r.getLowStockProducts(threshold);
	  }

}





