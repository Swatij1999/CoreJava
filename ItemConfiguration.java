package com.xworkz.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autoWiredd")
public class ItemConfiguration {
	public ItemConfiguration() {
		System.out.println("created item configuration");
		
	}
	@Bean
	public Item material() {
		System.out.println("register item with spring");
		Item it=new Item();
		it.setName("glass");
		return it;
		
	}
	@Bean
	public String softwareEngineer() {
		System.out.println("reg software engineer with spring");
		String ref=new String("softwareEngineer");
		return ref;
		
	}
	@Bean
	public int noOfYears() {
		System.out.println("reg software enginerr with spring");
		int ref=10;
		
		return ref;
	
		
	}

}
