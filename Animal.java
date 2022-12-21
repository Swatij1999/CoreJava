package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {

				
				String animal1 = "Dog";
				String animal2 = "Cat";
				String animal3 = "Elephant";
				String animal4 = "Tiger";
				String animal5 = "Lion";
				String animal6 = "Cow";
				String animal7 = "Fox";
				String animal8 = "Rabbit";
				String animal9 = "Rat";
				String animal10 = "Buffello";
				
			    Collection<String> animal = new ArrayList();
			    animal.add(animal1);
			    animal.add(animal2);
			    animal.add(animal3);
			    animal.add(animal4);
			    animal.add(animal5);
			    animal.add(animal6);
			    animal.add(animal7);
			    animal.add(animal8);
			    animal.add(animal9);
			    animal.add(animal10);
			    
			    System.out.println(animal);
			    
			    for(String element : animal) {
			    	System.out.println(element);
			    }
			    
			    System.out.println("Accessed using iterator");
			    
			    Iterator<String> ref = animal.iterator();
			    while(ref.hasNext()) {
			    	String value = ref.next();
			    	System.out.println(value);
			    }
			}

		}


	


