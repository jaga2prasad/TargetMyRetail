package com.jaga.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jaga.target.dto.PriceDto;
import com.jaga.target.dto.Product;
import com.jaga.target.service.MyRetailService;

@RestController
public class MyRetailController {
	@Autowired
	MyRetailService retailService;

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") String id) {
			Product prod = retailService.getProduct(id);
			return new ResponseEntity<Product>(prod, HttpStatus.OK);
		
	}

	@GetMapping("/products/{id}/price")
	public PriceDto getPrice(@PathVariable("id") String id) {
			return retailService.getPrice(Integer.parseInt(id));
	}

}
