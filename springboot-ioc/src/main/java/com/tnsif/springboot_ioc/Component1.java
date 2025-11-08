package com.tnsif.springboot_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
	
	@Autowired
	Component2 c2;
	
	void show() {
		c2.show();
	}
}
