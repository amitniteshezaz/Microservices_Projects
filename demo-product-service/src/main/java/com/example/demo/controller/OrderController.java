package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.Product;
import com.example.demo.entity.Store;
import com.example.demo.service.OrderServiceI;
import com.example.demo.service.ProductServiceI;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceI service;
	@GetMapping("/getAllOrder")
	public ResponseEntity<List<OrderInfo>> getAllOrders(){
		List<OrderInfo> list=service.getAllOrders();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return  ResponseEntity.of(Optional.of(list));

		
	}
	
	@GetMapping("/order/{oid}")
	public ResponseEntity<OrderInfo> getOrderByOrderId(@PathVariable String oid){
		OrderInfo order=service.getOrderById(oid);
		if(order==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(order));
	}
	
	@GetMapping("/cid")
	public ResponseEntity<ResponseEntity<Customer>> getCustomerDetails(){
		
		try {
			ResponseEntity<Customer> c=this.service.getCustomerDetails();
			return ResponseEntity.of(Optional.of(c));
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@GetMapping("/getorderdetailsbystatus/{order_status}/oid/{oid}")
	public ResponseEntity<OrderInfo> CheckOrderDetailsByStatus(@PathVariable String order_status, @PathVariable String oid){
		try {
		OrderInfo order=service.getOrderDetailsByStatus(order_status,oid);
		return ResponseEntity.of(Optional.of(order));
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
	}


}
