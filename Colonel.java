package com.xworkz.friday.bean;

import org.springframework.stereotype.Component;

@Component
public class Colonel {
	
	public Colonel() {
		System.out.println("creating colonel with no argument constructor");
	}
	@Override
	 public int hashCode() {
		
		return 10;
	 }

}
