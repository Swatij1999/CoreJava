package com.xworkz.autowired;

import org.springframework.context.annotation.Bean;

public class NewsPaperConfiguration {
	public NewsPaperConfiguration() {
		System.out.println("Created NewsPaperConfiguration");
	}

	@Bean
	public int newsPaperId() {
		System.out.println("Registering newsPaperId");
		return 123;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName");
		return "Vijayavaani";
	}

	@Bean
	public String newsPaperOwnerName() {
		System.out.println("Registering newsPaperOwnerName");
		return "Vijay sankeshwar";
	}

	@Bean
	public String newsPaperLanguage() {
		System.out.println("Registering newsPaperLanguage");
		return "Kannada";
	}

	@Bean
	public double newsPaperPrice() {
		System.out.println("Registering newsPaperPrice");
		return 4.50;
	}

}
