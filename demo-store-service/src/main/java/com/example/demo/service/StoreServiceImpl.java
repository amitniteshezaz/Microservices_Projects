package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Store;
import com.example.demo.repo.Storerepo;

@Service
public class StoreServiceImpl implements StoreServiceI{

	@Autowired
	private Storerepo repo;
	@Override
	public Store getStoreBySid(String sid) {
		// TODO Auto-generated method stub
		return repo.getOne(Integer.parseInt(sid));
	}

}
