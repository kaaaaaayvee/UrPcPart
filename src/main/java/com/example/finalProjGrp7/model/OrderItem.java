package com.example.finalProjGrp7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderItem")
public class OrderItem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="orderId")
	private String orderId;
	
	@Column(name="productId")
	private String productId;

	@Column(name="quantity")
	private String quantity;

	@Column(name="price")
	private String price;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public OrderItem(String orderId, String productId, String quantity, String price) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}


}
