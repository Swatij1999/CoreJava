package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		//string ,int
		List<String> list=new ArrayList<String>();
		list.add("R");//0
		list.add("Y");//1
		
		list.add("U");//2
		list.add("S");//3
		
		System.out.println("****************ADD************************");
		list.add(2, "E");
		//RYEUS
		
		for(String string: list) {
			System.out.println(string);
		}
		
		System.out.println("*****************REMOVE****************");
		list.remove(0);
		
		for(String ref:list) {
			System.out.println(ref);
			
		}
		
		System.out.println("*******************set*************************");
		list.set(0, "swati weds pundi");
		
		for(String ref:list) {
			System.out.println(ref);
		}
		
	
	}




		

	}


