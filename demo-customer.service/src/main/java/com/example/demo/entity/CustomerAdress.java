package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class CustomerAdress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int add_id;
	
	private String address_Line1;
	private String address_Line2;
	private String state;
	private String country;
	private String pin_code;
	private String phone;
	private String is_billingAddress;
	private String creation_Date;
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
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
	public CustomerAdress(int add_id, String address_Line1, String address_Line2, String state, String country,
			String pin_code, String phone, String is_billingAddress, String creation_Date) {
		super();
		this.add_id = add_id;
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
		return "CustomerAdress [add_id=" + add_id + ", address_Line1=" + address_Line1 + ", address_Line2="
				+ address_Line2 + ", state=" + state + ", country=" + country + ", pin_code=" + pin_code + ", phone="
				+ phone + ", is_billingAddress=" + is_billingAddress + ", creation_Date=" + creation_Date + "]";
	}
	
	

}
