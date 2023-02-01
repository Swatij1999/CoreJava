package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FiComponent {

	
	public FiComponent() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String toSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam int price) {
		
		System.out.println("running onSend post");
		System.out.println("Name :"+ name);
		System.out.println("Type :"+ type);
		System.out.println("Quantity :" + quantity);
		System.out.println("Price :" + price);
		
		return"FoodItem.jsp";
	}
}
