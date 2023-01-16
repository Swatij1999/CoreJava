package com.xworkz.springFramework.bean;

import org.springframework.stereotype.Component;

@Component

public class Airtel implements Provider{

	@Override
	public void connect() {
    System.out.println("create connect");		
	}
	
	public Airtel() {
		System.out.println("creating airtel with no-args constru...");
	}
	
}
