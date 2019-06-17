package com.jaga.target.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRICE")
public class Price {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private Integer productId;
	@Column
	private Double value;
	@Column
	private String curreny_code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getCurreny_code() {
		return curreny_code;
	}
	public void setCurreny_code(String curreny_code) {
		this.curreny_code = curreny_code;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	
}
