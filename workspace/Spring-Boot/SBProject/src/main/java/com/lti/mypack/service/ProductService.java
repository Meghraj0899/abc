//This is the Service Layer...................
package com.lti.mypack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.Product;
import com.lti.mypack.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prodRepo;
	public List<Product> getAllProducts(){
		return prodRepo.getAllProducts();
	}
	public String addProduct(Product product) {
		return prodRepo.addProduct(product);
	}
	public String updProduct(Product product) {
		return "Updated";
	}
	public String delProduct(Product product) {
		return "Deleted";
	}

}
