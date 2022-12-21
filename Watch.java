package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		

			
			String watch1 = "taitan";
			String watch2 = "sony";
			String watch3 = "fasttrack";
			String watch4 = "casio";
			String watch5 = "hmt";
			
			
		    Collection<String> watch = new ArrayList();
		    watch.add(watch1);
		    watch.add(watch2);
		    watch.add(watch3);
		    watch.add(watch4);
		    watch.add(watch5);
		    
		    
		    System.out.println(watch);
		    
		    for(String element : watch) {
		    	System.out.println(element);
		    }
		    
		    System.out.println("Accessed using iterator");
		    
		    Iterator<String> ref = watch.iterator();
		    while(ref.hasNext()) {
		    	String value = ref.next();
		    	System.out.println(value);
		    }
		}

	

		

	}


