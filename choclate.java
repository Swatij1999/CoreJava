package com.xworkz.thing;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class choclate {

	public static void main(String[] args) {
		Map<String,Double> map=new TreeMap<String,Double>();
		
		map.put("Bubbly",80.5);
		map.put("DairyMilk",50.5);
		map.put("Munch",10.5);
		map.put("Kitkat",40.5);
		map.put("MilkyBar",90.5);
		map.put("Strawberry",5.5);
		map.put("Cofee",15.5);
		map.put("Chocabar",16.5);
		map.put("Imali",5.10);
		map.put("Coconut",1.5);
		
		System.out.println(map.size());
		if(map.isEmpty()) {
			System.out.println("map nalli eno ide");
		}
		else {
			System.out.println("map nalli enu illa");
			
		}
		System.out.println("***********key***************");
		 Set<String> key=map.keySet();
		 
		 key.forEach(e->System.out.println(e));
		 
		 System.out.println("*********values********************");
		 Collection<Double>values=map.values();
		 values.forEach(e->System.out.println(e));
		 
		 System.out.println("************Both*****************");
		 Set<Entry<String,Double>> entries=map.entrySet();
		 for(Entry ref:entries) {
			 System.out.println(ref.getKey()+" "+ref.getValue());
		 }
	}	

	}


