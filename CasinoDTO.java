package com.xworkz.goaMvc.dto;

import lombok.Data;

@Data
public class CasinoDTO {
	
	private String name;
	private String location;
	private String entryFee;
	private boolean food;
	
	public CasinoDTO() {
		System.out.println("Created CasinoDTO using no-args constructor...");
	}


}
