package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Product;
import com.lti.mypack.service.ProductService;

@RestController
@RequestMapping("/productRest/api")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	@Autowired
	ProductService prodService;
	@GetMapping("/products")
	public List<Product> getAll(){
		return prodService.getProducts();
	}
	// Now we also have to add prodid to the path as well products/101 in this case only  ...getProductById
	@GetMapping("/products/{prodid}")
	public Product getProductById(@PathVariable(value="prodid") int prodid) {
		return prodService.findProduct(prodid);
	}
	
	@GetMapping("/productsbycat/{category}")//Here we are changing url from products to productsbycat so as to avoid confict as above method is also GetMapping 
	public List<Product> getProductById(@PathVariable(value="category") String category) {
		return prodService.findProductByCategory(category);
	}
	
	 @GetMapping("/productsbyprice/{lower}/{upper}")
     public List<Product> getProductByPrice(@PathVariable(value = "lower") int lower,@PathVariable(value = "upper") int upper)
     {
             return prodService.findProductByPriceRange(lower, upper);
            
     }       
	
	
	@PutMapping("/products")
	public boolean updateProduct(@RequestBody Product product) {
		return prodService.updateProduct(product);
	}
	
	@DeleteMapping("/products")
	public boolean deleteProduct(@RequestBody Product product) {
		return prodService.deleteProduct(product);
	}
	
	@PostMapping("/products")
	public boolean addProduct(@RequestBody Product product) {
		return prodService.addProduct(product);
	}
	

}
