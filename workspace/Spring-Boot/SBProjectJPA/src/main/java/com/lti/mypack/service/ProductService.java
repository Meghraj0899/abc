package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Product;

public interface ProductService {
	public List<Product> getProducts();
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product findProduct(int prodid);
	public List<Product> findProductByCategory(String category);
	public List<Product> findProductByPriceRange(int lower,int higher);
}
