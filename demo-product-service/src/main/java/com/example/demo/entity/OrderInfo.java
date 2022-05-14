package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
public class OrderInfo {
	@Id
	private int order_id;
	@NotEmpty
	private int order_number;
	private Date date;
	private String item_details;
	private String tax;
	private Long total_value;
	private String customer_details;
	private String order_status;
	// email should be a valid email format
	// email shouldn't be null or empty
	@NotEmpty
	@Email
	private String customer_email;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getOrder_number() {
		return order_number;
	}
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItem_details() {
		return item_details;
	}
	public void setItem_details(String item_details) {
		this.item_details = item_details;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public Long getTotal_value() {
		return total_value;
	}
	public void setTotal_value(Long total_value) {
		this.total_value = total_value;
	}
	public String getCustomer_details() {
		return customer_details;
	}
	public void setCustomer_details(String customer_details) {
		this.customer_details = customer_details;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public OrderInfo(int order_id, int order_number, Date date, String item_details, String tax, Long total_value,
			String customer_details, String order_status, String customer_email) {
		super();
		this.order_id = order_id;
		this.order_number = order_number;
		this.date = date;
		this.item_details = item_details;
		this.tax = tax;
		this.total_value = total_value;
		this.customer_details = customer_details;
		this.order_status = order_status;
		this.customer_email = customer_email;
	}
	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_number=" + order_number + ", date=" + date + ", item_details="
				+ item_details + ", tax=" + tax + ", total_value=" + total_value + ", customer_details="
				+ customer_details + ", order_status=" + order_status + ", customer_email=" + customer_email + "]";
	}
	
	
	
	
	
	
	

}
