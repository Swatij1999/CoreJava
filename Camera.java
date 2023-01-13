package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Camera {
	@Autowired
	private Lens lens;
	public Camera() {
		System.out.println("creating Camera with no argument");
	}

}
