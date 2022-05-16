package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Store;

@Repository
public interface Storerepo extends JpaRepository<Store, Integer> {
	@Query(value="Select * from store ud where ud.store_name=?1",nativeQuery=true)
	public Store getStoreDetailsByStoreName(String store_name);

}
