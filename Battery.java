package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Battery {
	@Autowired
	private Capacity capacity;
	public Battery() {
		System.out.println("creat Capacity with no arguments constructor ");
	}

}
