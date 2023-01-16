package com.xworkz.springFramework.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework.bean.Broweser;
import com.xworkz.springFramework.bean.Chrome;
import com.xworkz.springFramework.bean.FireBox;
import com.xworkz.springFramework.configuration.SpringConfiguration;

public class Runner1 {
	public static void main(String[]args) {
		
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(spring1.getBeanDefinitionNames()));
		System.out.println(spring1.getBeanDefinitionCount());
		
		Chrome ref=spring1.getBean(Chrome.class);
		ref.browse();
		
		FireBox ref1=spring1.getBean(FireBox.class);
		ref1.browse();
		
		

		
		
	}
		

}
