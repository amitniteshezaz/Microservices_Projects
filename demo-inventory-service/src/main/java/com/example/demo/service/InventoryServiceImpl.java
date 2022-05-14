package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inventory;
import com.example.demo.repo.InventoryRepo;
@Service
public class InventoryServiceImpl implements InventoryServiceI{

	@Autowired
	private InventoryRepo repo;
	@Override
	public Inventory getProductById(String pid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(pid));
	}
	@Override
	public Inventory getStoreById(String sid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(sid));
	}
	
	

}
