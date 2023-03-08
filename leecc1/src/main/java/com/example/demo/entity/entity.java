package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sport")
public class entity {

	@Id
	private int id;
	private String name;
	private float price;
	private String size;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public entity(int id, String name, float price,String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public entity() {
		
	}
}