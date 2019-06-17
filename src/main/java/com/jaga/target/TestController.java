package com.jaga.target;

import java.util.Arrays;

//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//import net.minidev.json.parser.JSONParser;
//import net.minidev.json.parser.ParseException;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public void getSome(){
		String url = "https://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		RestTemplate template = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    
		ResponseEntity<String> value  = template.exchange(url, HttpMethod.GET, entity, String.class);
		
		String val = value.getBody();
		
		JsonObject jsonObject = new JsonParser().parse(val).getAsJsonObject();
		
		//System.out.println(jsonObject.getAsJsonObject("product").getAsJsonObject("price").getAsJsonObject("listPrice").getAsJsonPrimitive("formattedPrice"));
		
		System.out.println(jsonObject.getAsJsonObject("product").getAsJsonObject("item").getAsJsonPrimitive("tcin"));
		
		System.out.println(jsonObject.getAsJsonObject("product").getAsJsonObject("item").getAsJsonObject("product_description").getAsJsonPrimitive("title"));

		
		//JSON
		
		/*JSONParser parse = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parse.parse(val);
			try {
				System.out.println(obj.getJSONObject("product").getJSONObject("price"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		//Gson son = new Gson();
		
		/*JSONParser parse = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parse.parse(val);
			try {
				System.out.println(obj.get("price"));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		System.out.println(value.getBody());
	}
}
