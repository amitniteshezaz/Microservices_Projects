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

import com.example.demo.entity.Customer;

import com.example.demo.service.CustomerServiceI;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceI service;
	
	@GetMapping("/getAllCustomerdetails")
	public ResponseEntity<List<Customer>> getAllCustomerDetails(){
		List<Customer> list=service.getAllCustomerDetails();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		//return  ResponseEntity.of(Optional.of(list));
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> getCustomerDetailsByCustomerId(@PathVariable String cid){
		Customer customer=service.getCustomerDetailsByCustomerId(cid);
		if(customer==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(customer));
	}
	
	@PostMapping("/addcustomerdetails")
	public ResponseEntity<Customer> addCustomerDetails(@RequestBody Customer customer){
		Customer c=null;
		try {
			this.service.addCustomerDetails(customer);
		return ResponseEntity.of(Optional.of(c));
	}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

}
