package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer,Integer>{

}
