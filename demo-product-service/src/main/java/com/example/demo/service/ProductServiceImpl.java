package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
//import com.example.demo.entity.OrderSort;
import com.example.demo.entity.Product;
import com.example.demo.entity.Store;
import com.example.demo.repo.Productrepo;

@Service
public class ProductServiceImpl implements ProductServiceI {
	
	private final RestTemplate restTemplate ;
	
	
	public ProductServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

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


	@Override
	public ResponseEntity<Store> getStoreDetails() {
		// TODO Auto-generated method stub
		return restTemplate.getForEntity("http://localhost:9092/store/2",Store.class);
		
	}

	/*
	 * @Override public OrderSort getOrderDetailsByLastNameOrderDate() { // TODO
	 * Auto-generated method stub List<Customer> customer=(List<Customer>)
	 * restTemplate.getForEntity("http://localhost:9091/getAllCustomerdetails",
	 * OrderSort.class); //List<OrderInfo> order=restTemplate.getForEntity(null,
	 * null) sort.setCustomer(customer); return sort; }
	 */
}
