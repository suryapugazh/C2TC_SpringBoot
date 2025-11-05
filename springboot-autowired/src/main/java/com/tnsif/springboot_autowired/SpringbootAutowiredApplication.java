package com.tnsif.springboot_autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAutowiredApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootAutowiredApplication.class, args);
		
		ConfigurableApplicationContext var = SpringApplication.run(SpringbootAutowiredApplication.class, args);
				
		Customer1 c1 = var.getBean(Customer1.class);
		c1.show();

	}

}
