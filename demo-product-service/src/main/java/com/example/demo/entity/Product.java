package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Product {
	@Id
	private int product_id;
	@NotEmpty
	private String product_name;
	//private Product BIG Image
	//Product Thumb_nail;
	private String product_description;
	private String product_Short_decription;
	private Long product_Ratings;
	private Long Price;
	private char is_Active;
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", product_Short_decription=" + product_Short_decription + ", product_Ratings="
				+ product_Ratings + ", Price=" + Price + ", is_Active=" + is_Active + "]";
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_Short_decription() {
		return product_Short_decription;
	}
	public void setProduct_Short_decription(String product_Short_decription) {
		this.product_Short_decription = product_Short_decription;
	}
	public Long getProduct_Ratings() {
		return product_Ratings;
	}
	public void setProduct_Ratings(Long product_Ratings) {
		this.product_Ratings = product_Ratings;
	}
	public Long getPrice() {
		return Price;
	}
	public void setPrice(Long price) {
		Price = price;
	}
	public Character getIs_Active() {
		return is_Active;
	}
	public void setIs_Active(Character is_Active) {
		this.is_Active = is_Active;
	}
	public Product(int product_id, String product_name, String product_description, String product_Short_decription,
			Long product_Ratings, Long price, char is_Active) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_Short_decription = product_Short_decription;
		this.product_Ratings = product_Ratings;
		Price = price;
		this.is_Active = is_Active;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
