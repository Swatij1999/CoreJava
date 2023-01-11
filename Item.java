package com.xworkz.autowired;

public class Item {
	 
	private String name;
	
	public Item() {
		System.out.println("Created item using no-arg const...");
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}

}
