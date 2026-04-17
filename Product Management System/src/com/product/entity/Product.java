package com.product.entity;

import java.time.LocalDate;

public class Product {

	private long id;
	private String name;
	private String category;
	private double price;
	private String mfg;
	private String exp;

	public Product() {
		super();

	}

	public Product(long id, String name, String category, double price, String mfg, String exp) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.mfg = mfg;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}


public String getExp() {
    return exp;
} 
	
	public void setExp(String exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", mfg=" + mfg
				+ ", exp=" + exp + "]";
	}

}
