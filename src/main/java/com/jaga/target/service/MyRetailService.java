package com.jaga.target.service;

import com.jaga.target.dto.PriceDto;
import com.jaga.target.dto.Product;


public interface MyRetailService {
	public Product getProduct(String id) ;
	public PriceDto getPrice(Integer id);
}
