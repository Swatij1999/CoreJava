package com.xworkz.springFramework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Broweser{
	@Autowired
	@Qualifier("airtel")
	public Provider provider;
	
	public Chrome() {
		System.out.println("creating chrome with no-args constru...");
	}

	@Override
	public void browse() {
    System.out.println("create browse");
    provider.connect();		

	}
	
	

}
