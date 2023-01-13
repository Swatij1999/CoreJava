package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	public CameraMan() {
		System.out.println("creating CameraMan with no argument");
	}

}
