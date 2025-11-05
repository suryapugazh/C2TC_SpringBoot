package com.tnsif.springboot_di_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int c_id;
	private String c_name;
	
	@Autowired
	@Qualifier("groscery")		// Order is an interface, when we have multiple class that implements Ordering Interface, simply Dynamic Binding,
							    // @Autowired confusing for which object should i map to create object, so Qualifier is a solution to this conflict
								// We should set name for qualifier with small characters as name often camelCase to link particular mappings
								// the grocery object will create with reference "ordering" reference with Ordering Interface 
	private Ordering ordering;  // we can set @Primary annotation to single class that Dominate other classes when implementing Interface
	
	public void order() {
		ordering.order();
	}
	
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	

}
