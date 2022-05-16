package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.Customerrepo;

@Service
public class CustomerServiceImpl implements CustomerServiceI{

	@Autowired
	private Customerrepo repo;
	@Override
	public List<Customer> getAllCustomerDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer getCustomerDetailsByCustomerId(String cid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(cid));
	}

	@Override
	public Customer addCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
		
	}

	
	
}
