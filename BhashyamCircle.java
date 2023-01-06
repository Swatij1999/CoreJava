package com.xworkz.thing;

import org.springframework.stereotype.Component;

@Component
public class BhashyamCircle extends Object {
	public BhashyamCircle() {
		super();
		System.out.println("Created BhashyamCircle by spring..");
	}
	public String toString() {
		return"BhashaymCircle[getClass()=" + getClass()+",hashCode()="+hashCode()+",toString()="+super.toString()+"]";
	}

}
