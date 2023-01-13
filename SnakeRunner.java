package com.xworkz.autowired;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SnakeRunner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SnakeConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Snake refOfSnake = container.getBean(Snake.class);
		System.out.println(refOfSnake);
	}


}
