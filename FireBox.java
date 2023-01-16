package com.xworkz.springFramework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class FireBox implements Broweser {
	@Autowired
	@Qualifier("jio")
	public Provider provider;


	public  FireBox() {
		System.out.println("creating FireBox with no-args constru...");

	}
		

	@Override
	public void browse() {
		System.out.println("creat browse");
          provider.connect();		
	}


		
	}

