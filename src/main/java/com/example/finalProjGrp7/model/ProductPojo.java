package com.example.finalProjGrp7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Product")
public class ProductPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	

	@Column(name="price")
	private String price;
	

	@Column(name="vendorId")
	private String vendorId;
	
	@Column(name="categoryId")
	private String catgoryId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getCatgoryId() {
		return catgoryId;
	}

	public void setCatgoryId(String catgoryId) {
		this.catgoryId = catgoryId;
	}

	public ProductPojo(String name, String description, String price, String vendorId, String catgoryId) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vendorId = vendorId;
		this.catgoryId = catgoryId;
	}

	
	
	
	
}
