
package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventry")
public class Inventry {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private double price;
	private String manufacturingdate;
	private String  expdate;
	private int warranty;
	private int quality;
	
	  public Inventry() {
	    }
	
	public Inventry(int id, String name, String category, double price, String manufacturingdate, String expdate,
			int warranty, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturingdate = manufacturingdate;
		this.expdate = expdate;
		this.warranty = warranty;
		this.quality = quality;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturingdate() {
		return manufacturingdate;
	}
	public void setManufacturingdate(String manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Inventry [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", manufacturingdate=" + manufacturingdate + ", expdate=" + expdate + ", warranty=" + warranty
				+ ", quality=" + quality + "]";
	}
	

}
