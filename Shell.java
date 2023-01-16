package com.xworkz.springFramework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;//interface:diesl or petrol
	
	public Shell() {
		System.out.println("Created Shell using no-arg const.....");
	}
	@Override
	public void  purchase() {
	   System.out.println("running purchase in shell....");
	   fuel.consume();
	}



}
