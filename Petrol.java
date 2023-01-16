package com.xworkz.springFramework.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements  Fuel{
	
	public Petrol() {
		System.out.println("Created Petrol using n0-arg const...");
	}
	@Override
	
	public void consume() {
	System.out.println("running consume in petrol...");
}
}

