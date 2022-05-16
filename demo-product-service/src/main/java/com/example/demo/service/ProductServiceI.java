package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.example.demo.entity.Product;
import com.example.demo.entity.Store;

public interface ProductServiceI {
	public List<Product> getAllProduct();

	public Product getProductById(String pid);

	public Product addProduct(Product product);

	public ResponseEntity<Store> getStoreDetails();

	//public OrderSort getOrderDetailsByLastNameOrderDate();

}
