package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Store;

@Repository
public interface Storerepo extends JpaRepository<Store, Integer> {

}
