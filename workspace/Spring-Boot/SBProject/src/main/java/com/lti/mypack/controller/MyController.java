package com.lti.mypack.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Product;
import com.lti.mypack.service.ProductService;

@Controller
@RequestMapping("/rest/api") //this will be common to address of all the components 
//like--localhost:9797//rest/api/hello or products  
public class MyController {
	
	@Autowired
	ProductService pService;

	@GetMapping("/hello")
	public String sayHello(){
		return "Welcome to Spring Boot REST";
	}
	@GetMapping("/products")
	public List<Product> showProducts(){
		return pService.getAllProducts();
	}
	@PostMapping("/products") // To check if data is received by the rest api from client we have to add extension advanced rest client to chrome
	public String addProduct(@RequestBody Product product){
		// we will insert the data  as an Object into the body part of the Advanced Rest Client 
		//and we will see the data received on the console if we print it 
		
		return pService.addProduct(product);
		//This Received will be printed in the Advanced Rest Client if it was successfull
		}
    @PutMapping("/products")
    public String updProduct(@RequestBody Product product)
    {
        return pService.updProduct(product);
    }
    @DeleteMapping("/products")
    public String delProduct(@RequestBody Product product) {
    	return this.pService.delProduct(product);
    }
}
