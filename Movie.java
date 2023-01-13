package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Movie {
	@Autowired
	private Director director;
	public Movie() {
		System.out.println("creat Movie with no arguments constructor ");
	}

}
