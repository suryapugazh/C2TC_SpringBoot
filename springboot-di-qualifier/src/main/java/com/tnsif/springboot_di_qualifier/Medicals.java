package com.tnsif.springboot_di_qualifier;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Medicals implements Ordering {

	public void order() {
		System.out.println("Ordering Medical Products");
	}

}
