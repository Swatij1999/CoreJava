package com.xworkz.goaMvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.goaMvc")

public class GoaConfiguration {
	
	public GoaConfiguration() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

}
