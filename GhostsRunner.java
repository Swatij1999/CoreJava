package com.xworkz.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GhostsRunner {

	ApplicationContext container = new AnnotationConfigApplicationContext(GhostsConfiguration.class);
	//System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

	Ghosts refOfGhosts = container.getBean(Ghosts.class);
	System.out.println(refOfGhosts);
