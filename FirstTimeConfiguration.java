package com.xworkz.autowired;

import org.springframework.context.annotation.Bean;

public class FirstTimeConfiguration {
	
	public FirstTimeConfiguration() {
		System.out.println("Created FirstTimeConfiguration");
		
	}
	
	@Bean
	public String softwareEnginner() {
		System.out.println("registerting softwareEnginner");
		String ref = new String("Software enginner");
		return ref;
		
	}
	
	public int year() {
		System.out.println("registering years..");
		int ref = 10;
		return ref;
	}

}
