package com.example.demo.service;

import org.springframework.http.ResponseEntity;


import com.example.demo.entity.Inventory;

public interface InventoryServiceI {

	public Inventory getProductById(String pid);

	

	public Inventory getStoreById(String sid);

}
