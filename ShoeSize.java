package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
						
						String ShoeSize1 = "1";
						String ShoeSize2 = "4";
						String ShoeSize3 = "5";
						String ShoeSize4 = "6";
						String ShoeSize5 = "7";
						String ShoeSize6 = "8";
						String ShoeSize7 = "9";
						String ShoeSize8 = "10";
						String ShoeSize9 = "2";
						String ShoeSize10 = "19";
						String ShoeSize11 = "11";
						String ShoeSize12 = "12";
						String ShoeSize13 = "13";
						String ShoeSize14 = "14";
						String ShoeSize15 = "15";
						
					    Collection<String> ShoeSize = new ArrayList();
					    ShoeSize.add(ShoeSize1);
					    ShoeSize.add(ShoeSize2);
					    ShoeSize.add(ShoeSize3);
					    ShoeSize.add(ShoeSize4);
					    ShoeSize.add(ShoeSize5);
					    ShoeSize.add(ShoeSize6);
					    ShoeSize.add(ShoeSize7);
					    ShoeSize.add(ShoeSize8);
					    ShoeSize.add(ShoeSize9);
					    ShoeSize.add(ShoeSize10);
					    ShoeSize.add(ShoeSize11);
					    ShoeSize.add(ShoeSize12);
					    ShoeSize.add(ShoeSize13);
					    ShoeSize.add(ShoeSize14);
					    ShoeSize.add(ShoeSize15);
					    
					    
					    System.out.println(ShoeSize);
					    
					    for(String element : ShoeSize) {
					    	System.out.println(element);
					    }
					    
					    System.out.println("Accessed using iterator");
					    
					    Iterator<String> ref = ShoeSize.iterator();
					    while(ref.hasNext()) {
					    	String value = ref.next();
					    	System.out.println(value);
					    }
					}

				


			




	}


