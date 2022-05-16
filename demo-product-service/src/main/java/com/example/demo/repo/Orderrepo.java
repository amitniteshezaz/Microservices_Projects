package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderInfo;
@Repository
public interface Orderrepo extends JpaRepository<OrderInfo,Integer> {
	@Query(value="Select * from order_info ud where ud.order_status=?1 and ud.order_id=?2",nativeQuery=true)
	public OrderInfo getOrderByStatus(String order_status,String oid);
	@Query(value="Select * from order_info ud where ud.order_id=?1 and order_status='PLACED'",nativeQuery=true)
	public OrderInfo deleteOrderByOid(String oid);



}
