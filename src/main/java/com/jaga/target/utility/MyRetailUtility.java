package com.jaga.target.utility;

import java.util.Arrays;
import java.util.Random;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.jaga.target.dto.PriceDto;


public class MyRetailUtility {
	
	public ResponseEntity<String> getResponse(String url){
		RestTemplate template = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    
		ResponseEntity<String> value  = template.exchange(url, HttpMethod.GET, entity, String.class);
		return value;
	}
	
	public PriceDto getPrice(String url){
		RestTemplate template = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    
		PriceDto price  = template.getForObject(url, PriceDto.class);
		return price;
	}
	
	
	public Integer genRandomNum(){
		Random random = new Random();
		return random.nextInt(100);	
	}
}
