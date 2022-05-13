package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAdress {
	@Id
	private int customer_id;
	private String address_Line1;
	private String address_Line2;
	private String state;
	private String country;
	private String pin_code;
	private String phone;
	private String is_billingAddress;
	private String creation_Date;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getAddress_Line1() {
		return address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}
	public String getAddress_Line2() {
		return address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		this.address_Line2 = address_Line2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIs_billingAddress() {
		return is_billingAddress;
	}
	public void setIs_billingAddress(String is_billingAddress) {
		this.is_billingAddress = is_billingAddress;
	}
	public String getCreation_Date() {
		return creation_Date;
	}
	public void setCreation_Date(String creation_Date) {
		this.creation_Date = creation_Date;
	}
	public CustomerAdress(int customer_id, String address_Line1, String address_Line2, String state, String country,
			String pin_code, String phone, String is_billingAddress, String creation_Date) {
		super();
		this.customer_id = customer_id;
		this.address_Line1 = address_Line1;
		this.address_Line2 = address_Line2;
		this.state = state;
		this.country = country;
		this.pin_code = pin_code;
		this.phone = phone;
		this.is_billingAddress = is_billingAddress;
		this.creation_Date = creation_Date;
	}
	public CustomerAdress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerAdress [customer_id=" + customer_id + ", address_Line1=" + address_Line1 + ", address_Line2="
				+ address_Line2 + ", state=" + state + ", country=" + country + ", pin_code=" + pin_code + ", phone="
				+ phone + ", is_billingAddress=" + is_billingAddress + ", creation_Date=" + creation_Date + "]";
	}
	
	

}
