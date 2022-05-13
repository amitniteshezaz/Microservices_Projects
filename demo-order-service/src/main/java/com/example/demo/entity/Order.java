package com.example.demo.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
	
	private int order_id;
	private int order_number;
	private Date date;
	private String item_details;
	private int tax;
	private Long total_value;
	private String customer_details;
	private String order_status;
	private String customer_email;
	
	

}
