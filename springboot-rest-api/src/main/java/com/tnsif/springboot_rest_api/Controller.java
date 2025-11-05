package com.tnsif.springboot_rest_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public String welcome() {
		return "Welcome to the RestfulAPI in Spring Boot";
	}

}
