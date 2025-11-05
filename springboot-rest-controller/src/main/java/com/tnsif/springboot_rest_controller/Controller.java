package com.tnsif.springboot_rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	// Handling GET request path
	@GetMapping("/hello")
	public String Welcome(@RequestParam(value="name",defaultValue="REST Controller - Get Request") String name) {
		return "Hello, " + name + "!";
	}
	
	// Handling GET request with path params
	@GetMapping("/greet/{name}")
	public String Greet(@PathVariable String name) {
		return "Welcome, " + toTitleCase(name) + "!";
		
	}
	
	@GetMapping("/order/{o_id}")
	public String OrderById(@PathVariable Integer o_id) {
		return "Your order id is: " + o_id;
	}
	
	// Method to change user name to Title
	public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder titleCaseBuilder = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                titleCaseBuilder.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                titleCaseBuilder.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                titleCaseBuilder.append(Character.toLowerCase(c));
            }
        }
        return titleCaseBuilder.toString();
    }
}