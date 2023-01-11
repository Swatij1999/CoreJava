package com.xworkz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Experience {
	@Autowired
	@Qualifier("softwareEngineer")
	private String role;
	@Autowired
	@Qualifier("noOfYears")
	private int noOfYears;
	
	public int getNoOfYears() {
		return noOfYears;
	}
	public String getRole() {
		return role;
	}

}
