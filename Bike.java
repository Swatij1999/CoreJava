package com.xworkz.collections;

import java.util.TreeSet;

public class Bike {

	public static void main(String[]args) {
		String Bike1="hero";
		String Bike2="pulser";
		String Bike3="yamaha";
		String Bike4="karishma";
		String Bike5="kenetic";
		String Bike6="tvs";
		String Bike7="hybuse";
		String Bike8="ktm";
		String Bike9="bulet";
		String Bike10="bajaj";
		String Bike11="royenfild";
		String Bike12="jupiter";
		String Bike13="honda";
		String Bike14="hero pulser";
		String Bike15="bajaj pulser";
		String Bike16="honda dio 150";
		String Bike17="honda jupiter";
		String Bike18="honda shine";
		
		TreeSet<String>collection=new TreeSet<String>();
		collection.add(Bike1);
		collection.add(Bike2);
		collection.add(Bike3);
		collection.add(Bike4);
		collection.add(Bike5);
		collection.add(Bike6);
		collection.add(Bike7);
		collection.add(Bike8);
		collection.add(Bike9);
		collection.add(Bike10);
		collection.add(Bike11);
		collection.add(Bike12);
		collection.add(Bike13);
		collection.add(Bike14);
		collection.add(Bike15);
		collection.add(Bike16);
		collection.add(Bike17);
		collection.add(Bike18);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clear....");
		System.out.println(collection.size());
	}

}


