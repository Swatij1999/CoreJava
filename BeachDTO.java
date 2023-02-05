package com.xworkz.goaMvc.dto;

import lombok.Data;

@Data
public class BeachDTO {
	
	private String name;
	private String location;
	private String game;
	private boolean clean;
	
	public BeachDTO() {
		System.out.println("Created BeachDTO using no-args constructor...");
	}

}
