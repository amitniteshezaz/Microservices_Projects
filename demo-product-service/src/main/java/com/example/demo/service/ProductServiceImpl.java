package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.Productrepo;

@Service
public class ProductServiceImpl implements ProductServiceI {

	@Autowired
	private Productrepo repo;
	
	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	@Override
	public Product getProductById(String pid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(pid));
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}
}
