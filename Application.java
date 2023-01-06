package com.xworkz.thing;

import org.springframework.stereotype.Component;

@Component
public class Application {
	public Application () {
		super();
		System.out.println("Created Application by spring..");
	}

	@Override
	public String toString() {
		return "Application [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
