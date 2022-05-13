package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.Product;


public interface OrderServiceI {

	public List<OrderInfo> getAllOrders();

	public OrderInfo getOrderById(String pid);

	public ResponseEntity<Customer> getCustomerDetails();

}
