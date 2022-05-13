package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
	
	@Id
	private int Store_Id;
	private String Store_name;
	private String Address_Line1;
	private String Address_Line2;
	private String State;
	private String Country;
	private int Pincode;
	private int Phone;
	private String Email;
	public int getStore_Id() {
		return Store_Id;
	}
	public void setStore_Id(int store_Id) {
		Store_Id = store_Id;
	}
	public String getStore_name() {
		return Store_name;
	}
	public void setStore_name(String store_name) {
		Store_name = store_name;
	}
	public String getAddress_Line1() {
		return Address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		Address_Line1 = address_Line1;
	}
	public String getAddress_Line2() {
		return Address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		Address_Line2 = address_Line2;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Store(int store_Id, String store_name, String address_Line1, String address_Line2, String state,
			String country, int pincode, int phone, String email) {
		super();
		Store_Id = store_Id;
		Store_name = store_name;
		Address_Line1 = address_Line1;
		Address_Line2 = address_Line2;
		State = state;
		Country = country;
		Pincode = pincode;
		Phone = phone;
		Email = email;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Store [Store_Id=" + Store_Id + ", Store_name=" + Store_name + ", Address_Line1=" + Address_Line1
				+ ", Address_Line2=" + Address_Line2 + ", State=" + State + ", Country=" + Country + ", Pincode="
				+ Pincode + ", Phone=" + Phone + ", Email=" + Email + "]";
	}
	
	
	
	
	


}
