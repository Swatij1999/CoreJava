package com.xworkz.autowired;

import org.springframework.context.annotation.Bean;

public class EngineConfiguration {
	public EngineConfiguration() {
		System.out.println("Created EngineConfiguration");
	}

	@Bean
	public String engineName() {
		System.out.println("Registering engineName");
		return "Tata";
	}

	@Bean
	public String engineType() {
		System.out.println("Registering engineType");
		return "Car";
	}

	@Bean
	public long engineNumber() {
		System.out.println("Registering engineNumber");
		return 97541236;
	}

	@Bean
	public String engineVersion() {
		System.out.println("Registering engineVersion");
		return "BSVI";
	}

	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany");
		return "TataCompany";
	}

	@Bean
	public int engineStrokes() {
		System.out.println("Registering engineStrokes");
		return 4;
	}

}
