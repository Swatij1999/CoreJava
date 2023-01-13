package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Autowired
	private Battery battery;
	public Lens() {
		System.out.println("creating Lens with no argument");
	}

}
