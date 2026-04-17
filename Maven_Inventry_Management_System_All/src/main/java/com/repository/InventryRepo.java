package com.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Inventry;

public class InventryRepo<Product> {
	
	private  static  SessionFactory config()
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		return sf;
	}
	
	public void addProduct(List<Inventry> list)
	{
		
		Session s = config().openSession();
	    org.hibernate.Transaction tr =  s.beginTransaction();

	    for(Inventry inv : list)
	    {
	        s.save(inv);
	    }
	    
	    tr.commit();
	    s.close();

	    System.out.println("multpile product added");
	}
	
	
	public int updateByID(int id,Inventry inv)
	{

		Session s = config().openSession();
		org.hibernate.Transaction tr = s.beginTransaction();  
	   Inventry newinv = s.get(Inventry.class, id);
	   
	   if(newinv!=null)
	   {
	   newinv.setName(inv.getName());
	   newinv.setCategory(inv.getCategory());
	   newinv.setPrice(inv.getPrice());
	   newinv.setManufacturingdate(inv.getManufacturingdate());
	   newinv.setExpdate(inv.getExpdate());
	   newinv.setWarranty(inv.getWarranty());
	   newinv.setQuality(inv.getQuality());
	   s.update(newinv);
	   tr.commit();
       s.close();

       return newinv.getId();
	   }
	   else
	   {
		   return 0;
	   }
		
	}

	
	public int delete(int id,Inventry inv)
	{

		Session s = config().openSession();
		org.hibernate.Transaction tr=s.beginTransaction();
		Inventry newinv = s.get(Inventry.class, id);
		
		if(newinv !=null)
		{
			s.delete(newinv);
	        System.out.println(" Deleted Successfully");
	    } else {
	        System.out.println(" ID Not Found");
	    }

	    tr.commit();
	    s.close();
		return id;
			
	}
	
	
	public  List<Inventry> getAllProducts()
	{
		Session s = config().openSession();
		org.hibernate.Transaction tr=s.beginTransaction();
		List<Inventry>inv=s.createCriteria(Inventry.class).list();
		tr.commit();  
		s.close();
		return inv;
		
	}
	
	public Inventry  fetchproduct(int id)
	{
		Session s = config().openSession();
		org.hibernate.Transaction tr=s.beginTransaction();
		Inventry newinv=s.get(Inventry.class, id);
	    tr.commit();
	    s.close();
		return newinv;
		
		
	}
	
	 public List<Inventry> getProductsByCategory(String category){
		Session s = config().openSession();
		Criteria cr = s.createCriteria(Inventry.class);
	    cr.add(Restrictions.eq("category", category));

	    List<Inventry> list = cr.list();
	    s.close();
	    return list;
		
	}
	 
	 public List<Inventry> getProductsByName(String name) 
	 {

			Session s = config().openSession();
			Criteria cr=s.createCriteria(Inventry.class);
			cr.add(Restrictions.eq("name",name));
			List<Inventry>list=cr.list();
			s.close();
			return list;
			
	 }
	 
	 public List<Inventry> getProductsPriceGreaterThan(double price)
	 {
	     Session s = config().openSession();

	     Criteria c = s.createCriteria(Inventry.class);
	     c.add(Restrictions.gt("price", price)); // price greater than input

	     List<Inventry> list = c.list();

	     s.close();
	     return list;
	 }
	 
	 
	 public List<Inventry> getProductsPriceLessThan(double price)
	 {
	     Session s = config().openSession();

	     Criteria c = s.createCriteria(Inventry.class);
	     c.add(Restrictions.lt("price", price)); // price greater than input

	     List<Inventry> list = c.list();

	     s.close();
	     return list;
	 }
	 
	 public List<Inventry> getProductsBetweenPrice(double minPrice, double maxPrice)
	 {
	     Session s = config().openSession();

	     Criteria c = s.createCriteria(Inventry.class);
	     c.add(Restrictions.between("price", minPrice, maxPrice));

	     List<Inventry> list = c.list();

	     s.close();
	     return list;
	 }

	 
	 
	 public List<Inventry> getProductsOrderByPriceAsc()
	 {
	     Session s = config().openSession();
	     Criteria cr=s.createCriteria(Inventry.class);
	     cr.addOrder(Order.asc("price"));
	     List<Inventry> list=cr.list();
	     s.close();
	     return list;
	 }
	 
	 public List<Inventry> getProductsOrderByPricedesc()
	 {
	     Session s = config().openSession();
	     Criteria cr=s.createCriteria(Inventry.class);
	     cr.addOrder(Order.desc("price"));
	     List<Inventry> list=cr.list();
	     s.close();
	     return list;
	 }
	 
	 
	 public List<Inventry> getProductsWithWarrantyGreaterThan(int months)
	 {
	     Session s = config().openSession();

	     Criteria c = s.createCriteria(Inventry.class);
	     c.add(Restrictions.gt("warranty", months)); // warranty > input

	     List<Inventry> list = c.list();

	     s.close();
	     return list;
	 }


	 public List<Inventry>getAvailableProducts()
	 {
		 Session s = config().openSession();
		 Criteria c = s.createCriteria(Inventry.class);
		 c.add(Restrictions.gt("quality", 0));
		 List<Inventry>list=c.list();
		 return list;
	 }
	 
	 
	  public List<Inventry> getProductsManufacturedAfter(String mfgDate) {
		  Session s = config().openSession();
		   Criteria cr=s.createCriteria(Inventry.class);
		   cr.add(Restrictions.eq("manufacturingdate",mfgDate));
		   List<Inventry>list=cr.list();
		   s.clear();  
		  return list;
	 }
	 
	  public List<Inventry> getProductsExpiringBefore(String expDate)
	  {
	      Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);

	      // less than given date
	      c.add(Restrictions.lt("expdate", expDate));

	      List<Inventry> list = c.list();

	      s.close();

	      return list;
	  }
	  
	  
	  
	  public Long countTotalProducts()
	  {
	      Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);

	      c.setProjection(Projections.rowCount());

	      Long count = (Long) c.uniqueResult();

	      s.close();

	      return count;
	  }
	  

	  public double getMaxPricedProducts() 
	  {
		  Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);
	      c.setProjection(Projections.max("price"));
	      Double maxPrice = (Double) c.uniqueResult();
	      Criteria c2 = s.createCriteria(Inventry.class);
	      c2.add(Restrictions.eq("price", maxPrice));

	      s.close();

	      return maxPrice ;

	  }
	  
	  public  Double getAverageProductPrice() 
	  {

		  Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);
	      c.setProjection(Projections.avg("price"));
	      Double avgprice=(Double) c.uniqueResult();
	      s.close();
	      return avgprice;
	  }
	  
	  public Long getTotalStockCount()
	  {

		  Session s = config().openSession();
	      Criteria c = s.createCriteria(Inventry.class);
	      c.setProjection(Projections.sum("quality"));
	      Long totalcount= (Long) c.uniqueResult();
	     s.close();
	      return totalcount;
	  }
	  
	  
	  public List<String> getDistinctCategories()
	  {
	      Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);

	      c.setProjection(Projections.distinct(Projections.property("category")));

	      List<String> categories = c.list();

	      s.close();

	      return categories;
	  }

	  
	  public List<Inventry> getHighestStockProducts()
	  {
	      Session s = config().openSession();

	      // STEP 1: Find Maximum Quantity
	      Criteria c1 = s.createCriteria(Inventry.class);
	      c1.setProjection(Projections.max("quality"));

	      Integer maxQty = (Integer) c1.uniqueResult();

	      // STEP 2: Fetch Products Having That Quantity
	      Criteria c2 = s.createCriteria(Inventry.class);
	      c2.add(Restrictions.eq("quality", maxQty));

	      List<Inventry> list = c2.list();

	      s.close();

	      return list;
	  }

	  
	  public List<Inventry> getLowStockProducts(int threshold)
	  {
	      Session s = config().openSession();

	      Criteria c = s.createCriteria(Inventry.class);

	      // Restriction: quantity < threshold
	      c.add(Restrictions.lt("quality", threshold));

	      List<Inventry> list = c.list();

	      s.close();

	      return list;
	  }

	  
	 
}
