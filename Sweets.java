package com.xworkz.collections;

import java.util.TreeSet;

public class Sweets {
	public static void main(String[]args) {
		String sweet1="jeelebi";
		String sweet2="jamun";
		String sweet3="jangir";
		String sweet4="balusha";
		String sweet5="kaju barfi";
		String sweet6="peda";
		String sweet7="kundaa";
		String sweet8="motichur ladu";
		String sweet9="karadantu";
		String sweet10="paper sweet";
		String sweet11="champakali";
		String sweet12="rasagula";
		String sweet13="halwa";
		
		TreeSet<String>collection=new TreeSet<String>();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clear....");
		System.out.println(collection.size());
	}

}
