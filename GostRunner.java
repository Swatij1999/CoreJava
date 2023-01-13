package com.xworkz.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GostRunner {
	public static void main(String args[]) {
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		//System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
	}

}
