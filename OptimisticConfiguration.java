package com.xworkz.friday.bean;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages="com.xworkz.friday",
excludeFilters= {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=Collection.class)})

public class OptimisticConfiguration {
	ApplicationContext spring=new AnnotationConfigApplicationContext();
	
	public OptimisticConfiguration() {
		
		System.out.println("creating OptimisticConfiguration with no argument constructor");
	}

}
