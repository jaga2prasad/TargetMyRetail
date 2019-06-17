package com.jaga.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jaga.target.dao.PriceInt;
import com.jaga.target.dto.PriceDto;
import com.jaga.target.dto.Product;
import com.jaga.target.entity.Price;
import com.jaga.target.utility.MyRetailUtility;

@Service
public class MyRetailServiceImpl implements MyRetailService {

	@Autowired
	PriceInt priceIntf;

	@Autowired
	MyRetailUtility utility;

	@Value("${product.url}")
	private String productUrl;

	@Value("${price.url}")
	private String priceUrl;

	public Product getProduct(String id)  {
		String url = productUrl.replace("pid", id);
		Product prod = new Product();
		try{
			ResponseEntity<String> value = utility.getResponse(url);
	
			JsonObject jsonObject = new JsonParser().parse(value.getBody()).getAsJsonObject();
	
			String title = jsonObject.getAsJsonObject("product").getAsJsonObject("item")
					.getAsJsonObject("product_description").getAsJsonPrimitive("title").getAsString();
			
			String pUrl = priceUrl.replace("pid", id);
			PriceDto pValue = utility.getPrice(pUrl);
	
			prod.setId(Integer.parseInt(id));
			prod.setName(title);
			prod.setCurrent_price(pValue);
		} catch (Exception e) {
			prod.setId(Integer.parseInt(id));
		}

		return prod;
	}

	public PriceDto getPrice(Integer id) {
		List<Price> price = priceIntf.findByProductId(id);
		if (price.isEmpty()) {
			Integer value = utility.genRandomNum();
			Price p = new Price();
			p.setProductId(id);
			p.setValue(Double.valueOf(value));
			p.setCurreny_code("USD");
			priceIntf.save(p);
		}

		Price price1 = priceIntf.findByProductId(id).get(0);

		PriceDto dto = new PriceDto();
		dto.setCurreny_code(price1.getCurreny_code());
		dto.setValue(price1.getValue());

		return dto;
	}
}
