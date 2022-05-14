package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Inventory;
import com.example.demo.service.InventoryServiceI;



@RestController
public class InventoryController {
	@Autowired
	private InventoryServiceI service;
	@GetMapping("/product/{pid}")
	public ResponseEntity<Inventory> getProductByProductId(@PathVariable String pid){
		Inventory product=service.getProductById(pid);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(product));
	}
	
	
	@GetMapping("/sid")
	public ResponseEntity<Inventory> getStoreDetails(@PathVariable String sid){
		
		Inventory product=service.getStoreById(sid);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(product));
	
		
		
	}

}
