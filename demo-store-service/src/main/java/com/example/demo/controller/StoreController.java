package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Store;
import com.example.demo.service.StoreServiceI;

@RestController
public class StoreController {
	@Autowired
	private StoreServiceI service;
	
	
	@GetMapping("/store/{sid}")
	public ResponseEntity<Store> getStoreDetailsByStoreId(@PathVariable String sid){
		Store order=service.getStoreBySid(sid);
		if(order==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(order));
	}	
	
}
