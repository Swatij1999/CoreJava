package com.xworkz.autowired;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(FirstTimeConfiguration.class);
		Item ref = container.getBean("material",Item.class);
		System.out.println(ref.getName());
		
		
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Experience ref1 =container. getBean(Experience.class);
		
		System.out.println(ref1.getNoOfYears());//10
		System.out.println(ref1.getRole());//tester
		
	}

}
