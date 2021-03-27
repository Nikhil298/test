package com.cg.stock.appln;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cg.stock")
public class ItemAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ItemAppln.class, args);
	}

}