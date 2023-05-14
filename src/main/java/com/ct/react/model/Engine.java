package com.ct.react.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "engine")
public class Engine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="etype",nullable = false)
	private String type;
	
	@Column(name="ename",nullable = false)
	private String name;
	
	@Column(name="ematerial",nullable = false)
	private String material;
	
    @Column(name="cost", nullable = false)	
	private String cost;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Engine(long id, String type, String name, String material, String cost) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.material = material;
		this.cost = cost;
	}

	public Engine() {
		super();
		
	}

	@Override
	public String toString() {
		return "id=" + id + ", type=" + type + ", name=" + name + ", material=" + material + ", cost=" + cost;
	}
}
