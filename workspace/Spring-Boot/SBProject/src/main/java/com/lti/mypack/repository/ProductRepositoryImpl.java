//This is the DAO Layer

package com.lti.mypack.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Product;

@Repository
@Transactional //This will allow us to persist data even without TransactionManager.begin()
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	EntityManager eMan;
	@Override
	public String addProduct(Product product) {
		eMan.persist(product);
		return "Product Added";
	}

	@Override
	public List<Product> getAllProducts() {
		return eMan.createQuery("from Product").getResultList();
	}

}
