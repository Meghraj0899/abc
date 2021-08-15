package com.lti.mypack.repository;

import java.util.List;

import com.lti.mypack.model.Product;

public interface ProductRepository {
	public String addProduct(Product product);
	public List<Product> getAllProducts();
}
