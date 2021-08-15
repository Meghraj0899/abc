package com.lti.mypack.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.Product;
import com.lti.mypack.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository prodRepo;
	
	@Override
	public List<Product> getProducts() {
		return prodRepo.findAll();
	}

	@Override
	public boolean addProduct(Product product) {
		prodRepo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		Product newp=prodRepo.findById(product.getProdid()).get();
		newp=product;
		prodRepo.save(newp);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		prodRepo.delete(product);
		return true;
	}

	@Override
	public Product findProduct(int prodid) {
		
		return prodRepo.findById(prodid).get();
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return prodRepo.findByCategory(category); //this method is not already available and we make it inside ProductRepository
	}
	@Override
	public List<Product> findProductByPriceRange(int lower,int higher) {
		// TODO Auto-generated method stub
		return prodRepo.findByPriceRange(lower, higher); //this method is not already available and we make it inside ProductRepository
	}
	
}
