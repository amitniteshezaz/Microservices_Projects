package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.Product;
import com.example.demo.repo.Orderrepo;
@Service
public class OrderServiceImpl implements OrderServiceI{
private final RestTemplate restTemplate;
	
	public OrderServiceImpl(RestTemplate restTemplate) {
	super();
	this.restTemplate = restTemplate;
}
	
	@Autowired
	private Orderrepo repo;
	@Override
	public List<OrderInfo> getAllOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public OrderInfo getOrderById(String oid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(oid));
	}
	@Override
	public ResponseEntity<Customer> getCustomerDetails() {
		return restTemplate.getForEntity("http://localhost:9091/customer/5",Customer.class);
		
	}
	@Override
	public OrderInfo getOrderDetailsByStatus(String order_status,String oid) {
		// TODO Auto-generated method stub
		return (OrderInfo) repo.getOrderByStatus(order_status,oid);
	}

}
