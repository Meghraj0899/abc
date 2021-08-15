package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductX1")
public class Product {
	@Id
	private int prodid;
	private String prodname;
	private int price;
	private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, String prodname, int price, String category) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.price = price;
		this.category = category;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
