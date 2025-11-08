package com.tnsif.springboot_ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootIocApplication {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac =  SpringApplication.run(SpringbootIocApplication.class, args);
		
		Component1 c1 = cac.getBean(Component1.class);
		c1.show();     // prints Component 2
		
	}

}
