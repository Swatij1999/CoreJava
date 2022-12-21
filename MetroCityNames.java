package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {

	public static void main(String[] args) {
					
						String MetroCityNames1 = "kuvempu metro station";
						String MetroCityNames2 = "rajaji nagar ";
						String MetroCityNames3 = "yashwantpur";
						String MetroCityNames4 = "mejestic";
						String MetroCityNames5 = "jayanagr";
						
						
					    Collection<String> MetroCityNames = new ArrayList();
					    MetroCityNames.add(MetroCityNames1);
					    MetroCityNames.add(MetroCityNames2);
					    MetroCityNames.add(MetroCityNames3);
					    MetroCityNames.add(MetroCityNames4);
					    MetroCityNames.add(MetroCityNames5);
					    
					    
					    System.out.println(MetroCityNames);
					    
					    for(String element : MetroCityNames) {
					    	System.out.println(element);
					    }
					    
					    System.out.println("Accessed using iterator");
					    
					    Iterator<String> ref = MetroCityNames.iterator();
					    while(ref.hasNext()) {
					    	String value = ref.next();
					    	System.out.println(value);
					    }
					}

				


			




	}


