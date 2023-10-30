package com.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sms.*" })
@EntityScan("com.sms.*")  
public class SmsMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsMicroApplication.class, args);
	}
	
	
	

}
