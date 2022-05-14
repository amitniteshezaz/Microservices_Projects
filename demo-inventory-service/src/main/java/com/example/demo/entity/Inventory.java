package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int product_id;
	@Id
	private int store_id;
	private int qty;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Inventory(int product_id, int store_id, int qty) {
		super();
		this.product_id = product_id;
		this.store_id = store_id;
		this.qty = qty;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inventory [product_id=" + product_id + ", store_id=" + store_id + ", qty=" + qty + "]";
	}
	

}
