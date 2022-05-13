package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerServiceI {

	public List<Customer> getAllCustomerDetails();

	public Customer getCustomerDetailsByCustomerId(String cid);

}
