package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Product;
//JpaRepository is capable of doing transactions automatically

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	public List<Product> findByCategory(String category);
	//This method is not already available inside JpaRepository
	
	 @Query("from Product p where p.price BETWEEN ?1 AND ?2")
	public List<Product> findByPriceRange(int lower,int higher);
	//We are writing query because lower and upper is not a Product pojo class variable name
}
