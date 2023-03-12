package com.example.finalProjGrp7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductCategory")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	

	@Column(name="code")
	private String code;
	

	@Column(name="description")
	private String description;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public ProductCategory(String name, String code, String description) {
		super();
		this.name = name;
		this.code = code;
		this.description = description;
	}
	
	
	
}
