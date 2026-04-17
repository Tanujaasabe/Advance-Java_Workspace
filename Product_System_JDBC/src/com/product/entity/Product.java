package com.product.entity;

public class Product {
	private int id;
	private String name;
	private String category;
	private double price;
	private String mfgdate;
	private String expdate;
	public Product(int id, String name, String category, double price, String mfgdate, String expdate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
	}
	public Product() {
		// TODO Auto-generated constructor stub
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
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", mfgdate="
				+ mfgdate + ", expdate=" + expdate + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getCategory()=" + getCategory() + ", getPrice()=" + getPrice() + ", getMfgdate()=" + getMfgdate()
				+ ", getExpdate()=" + getExpdate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
