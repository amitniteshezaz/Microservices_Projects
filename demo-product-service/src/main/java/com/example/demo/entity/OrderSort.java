//package com.example.demo.entity;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class OrderSort {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private List<Customer> customer;
//	private List<OrderInfo> order;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public List<Customer> getCustomer() {
//		return customer;
//	}
//	public void setCustomer(List<Customer> customer) {
//		this.customer = customer;
//	}
//	public List<OrderInfo> getOrder() {
//		return order;
//	}
//	public void setOrder(List<OrderInfo> order) {
//		this.order = order;
//	}
//	public OrderSort(int id, List<Customer> customer, List<OrderInfo> order) {
//		super();
//		this.id = id;
//		this.customer = customer;
//		this.order = order;
//	}
//	public OrderSort() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "OrderSort [id=" + id + ", customer=" + customer + ", order=" + order + "]";
//	}
//
//	
//	
//
//}
