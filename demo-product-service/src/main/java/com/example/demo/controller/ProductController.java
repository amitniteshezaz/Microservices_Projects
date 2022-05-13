package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductServiceI;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceI service;
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list=service.getAllProduct();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		//return  ResponseEntity.of(Optional.of(list));
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	@GetMapping("/product/{pid}")
	public ResponseEntity<Product> getProductByProductId(@PathVariable String pid){
		Product product=service.getProductById(pid);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(product));
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product p=null;
		try {
			p=this.service.addProduct(product);
			return ResponseEntity.of(Optional.of(p));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	

}
