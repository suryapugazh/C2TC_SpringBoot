package com.tnsif.springboot_di_qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDiQualifierApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootDiQualifierApplication.class, args);
		
		ConfigurableApplicationContext var = SpringApplication.run(SpringbootDiQualifierApplication.class, args);
		Customer c = var.getBean(Customer.class);
		c.order();

	}

}
