package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductServiceI {
	public List<Product> getAllProduct();

	public Product getProductById(String pid);

	public Product addProduct(Product product);

}
