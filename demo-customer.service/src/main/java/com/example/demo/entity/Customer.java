package com.example.demo.entity;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int customer_id;
	private String last_Name;
	private String first_Name;
	private String email;
	private String phone;
	private String registeration_Date;
	private String dob;
	private String pwd;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_add_id")
	private CustomerAdress address;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegisteration_Date() {
		return registeration_Date;
	}
	public void setRegisteration_Date(String registeration_Date) {
		this.registeration_Date = registeration_Date;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
	public CustomerAdress getAddress() {
		return address;
	}
	public void setAddress(CustomerAdress address) {
		this.address = address;
	}
	public Customer(int customer_id, String last_Name, String first_Name, String email, String phone,
			String registeration_Date, String dob, String pwd, CustomerAdress address) {
		super();
		this.customer_id = customer_id;
		this.last_Name = last_Name;
		this.first_Name = first_Name;
		this.email = email;
		this.phone = phone;
		this.registeration_Date = registeration_Date;
		this.dob = dob;
		this.pwd = pwd;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", last_Name=" + last_Name + ", first_Name=" + first_Name
				+ ", email=" + email + ", phone=" + phone + ", registeration_Date=" + registeration_Date + ", dob="
				+ dob + ", pwd=" + pwd + ", address=" + address + "]";
	}
	

}
