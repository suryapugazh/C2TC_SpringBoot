package com.tnsif.springboot_di_qualifier;

import org.springframework.stereotype.Component;

@Component
public class Groscery implements Ordering {
	
	public void order() {
		System.out.println("Ordering grocery Products...");
	}
	

}
