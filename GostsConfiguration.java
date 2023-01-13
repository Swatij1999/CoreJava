package com.xworkz.autowired;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;

public class GostsConfiguration {
	public GhostsConfiguration() {
		System.out.println("Creating GhostConfiguration");
	}

	@Bean
	public String ghostName() {
		System.out.println("Registering ghostName");
		return "Kanchana";
	}

	@Bean
	public String ghostGender() {
		System.out.println("Registering ghostGender");
		return "Female";
	}

	@Bean
	public int ghostAge() {
		System.out.println("Registering ghostAge");
		return 40;
	}

	@Bean
	public double ghostNailLength() {
		System.out.println("Registering ghostNailLength");
		return 2.5;
	}

	@Bean
	public double ghostHeight() {
		System.out.println("Registering ghostHeight");
		return 5.8;
	}

	@Bean
	public String ghostMotherName() {
		System.out.println("Registering ghostMotherName");
		return "Sonu";
	}

	@Bean
	public String ghostFatherName() {
		System.out.println("Registering ghostFatherName");
		return "Arun";
	}

	@Bean
	public String ghostTypeOfDeath() {
		System.out.println("Registering ghostTypeOfDeath");
		return "Suicide";
	}

	@Bean
	public String ghostDressCode() {
		System.out.println("Registering ghostDressCode");
		return "Skirt";
	}

	@Bean
	public LocalDate ghostDateOfDeath() {
		System.out.println("Registering ghostDateOfDeath");
		return LocalDate.of(2023, 02, 27);
	}

	@Bean
	public long ghostAadharNo() {
		System.out.println("Registering ghostAadharNo");
		return 852014796301l;
	}

	@Bean
	public String ghostPanNo() {
		System.out.println("Registering ghostPanNo");
		return "MVCDER345";
	}

	@Bean
	public long ghostVoterIdNo() {
		System.out.println("Registering ghostVoterIdNo");
		return 789654123l;
	}

	@Bean
	public boolean ghostIsGraduated() {
		System.out.println("Registering ghostIsGraduated");
		return true;
	}

	@Bean
	public String ghostReligion() {
		System.out.println("Registering ghostReligion");
		return "Hindu";
	}

	@Bean
	public String ghostInstagramId() {
		System.out.println("Registering ghostInstagramId");
		return "DadsLilPrincess";
	}

	@Bean
	public String ghostSnapId() {
		System.out.println("Registering ghostSnapId");
		return "MomsQueen";
	}

	@Bean
	public long ghostPhNo() {
		System.out.println("Registering ghostPhNo");
		return 98765412304l;
	}

	@Bean
	public boolean ghostIsMarried() {
		System.out.println("Registering ghostIsMarried");
		return true;
	}

	@Bean
	public boolean ghostBPL() {
		System.out.println("Registering ghostBPL");
		return true;
	}

}
