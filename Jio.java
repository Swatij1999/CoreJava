package com.xworkz.springFramework.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
    System.out.println("creating connect");		
	}

	   public Jio() {
		   System.out.println("creating jio with no-args constru...");
	   }
}
