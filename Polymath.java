package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Polymath {
	
	@Autowired
	private Colonel colonel;
	
	public Polymath() {
		System.out.println("creating polymath with no argument constructor");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.colonel.hashCode()+"hashcode of reference");
	}

}
