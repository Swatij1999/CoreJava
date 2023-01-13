package com.xworkz.friday.Configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class ProducerConfiguration {
	@Configuration
	@ComponentScan(basePackages="com.xworkz.sprigReference",
			excludeFilters= {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=Collection.class)})

	
	public ProducerConfiguration() {
	System.out.println("creating producer with no argument constructor");

}
}
