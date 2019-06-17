package com.jaga.target.dto;

public class Product {
	private int id;
	private String name;
	private PriceDto current_price;
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
	public PriceDto getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(PriceDto current_price) {
		this.current_price = current_price;
	}
	
	
	
	
}
