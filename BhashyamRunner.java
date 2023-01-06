package com.xworkz.thing;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BhashyamRunner {
   public static void main(String[]args) {
	   ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	   BhashyamCircle ref = spring.getBean(BhashyamCircle.class);
	   System.out.println(ref);
   }
}
