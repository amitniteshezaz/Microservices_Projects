package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.Product;
import com.example.demo.entity.Store;


public interface OrderServiceI {

	public List<OrderInfo> getAllOrders();

	public OrderInfo getOrderById(String pid);

	public ResponseEntity<Customer> getCustomerDetails();

	public OrderInfo getOrderDetailsByStatus(String order_status,String oid);

	public OrderInfo addOrder(OrderInfo order);

	public void deleteOrderByOrderID(String oid);



}
