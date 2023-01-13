package com.xworkz.autowired;

import org.springframework.context.annotation.Bean;

public class GhostConfiguration {
	public GhostConfiguration() {
		System.out.println("Created GhostConfiguration");
		}
		
		
		@Bean
		public String ghostName() {
			
			System.out.println("registering ghostName");
			return "Sneha";
		}
		
		@Bean
		public String ghostGender() {
			System.out.println("registered ghostGender");
			return "Not disclosed";
			
		}
		
		@Bean
		public double nailLength() {
			System.out.println("registering nailLength");
			return 5.5;
		}
		
	   @Bean
	   public Object dateOfDeath() {
		   System.out.println("registered death date");
		   return "2022-01-23";
	   }


}
