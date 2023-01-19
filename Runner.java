package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.MissileDTO;
import com.xworkz.dto.ResortDTO;
import com.xworkz.service.FirstAidService;
import com.xworkz.service.MissileService;
import com.xworkz.service.ResortService;

public class Runner {
	
	public static void main(String[]args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		System.out.println("Missile Runner");
		MissileService service=container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved"+saved);
		
		System.out.println("FirstAid Runner");
		FirstAidService service1=container.getBean(FirstAidService.class);
		boolean saved1 = service1.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+saved1);
		
		System.out.println("Resort Runner");
		ResortService service11=container.getBean(ResortService.class);
		boolean saved11 = service11.validateAndSave(new ResortDTO());
		System.out.println("saved"+saved11);
	}

}
