package com.jaga.target.dto;

public class PriceDto {
	private Double value;
	private String curreny_code;
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
	@Override
	public String toString() {
		return "Price [value=" + value + ", curreny_code=" + curreny_code + "]";
	}
	
	
}
