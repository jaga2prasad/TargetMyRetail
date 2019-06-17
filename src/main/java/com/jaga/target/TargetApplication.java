package com.jaga.target;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jaga.target.utility.MyRetailUtility;

@SpringBootApplication
public class TargetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TargetApplication.class, args);
	}
	
	@Bean
	public MyRetailUtility restCall(){
		return new MyRetailUtility();
	}
}
