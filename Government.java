package com.xworkz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Government {
	
	@Autowired
	@Qualifier("govtName")
	private String name;
	@Autowired
	@Qualifier("presidentName")
	private String presidentName;
	@Autowired
	private double tenure;
	@Autowired
	private int totalMembers;
	@Autowired
	private boolean majority;
	
	@Override
	public String toString() {
		return "Government [name=" + name + ", presidentName=" + presidentName + ", tenure=" + tenure
				+ ", totalMembers=" + totalMembers + ", majority=" + majority + "]";
	}
	
	

}
