package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Experience {
	@Autowired
	private Skill skill;
	public Experience() {
		System.out.println("creat Experience with no arguments constructor ");
	}
}


