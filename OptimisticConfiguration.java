package com.xworkz.friday.Configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;



public class OptimisticConfiguration {
	
	@Configuration
	@ComponentScan(basePackages="com.xworkz.sprigReference",
			excluders= {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=Collection.class)})

	
	public OptimisticConfiguration() {
		System.out.println("creating OptimisticConfiguration with no argument constructor");
	}
	

}
