package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class ListRunner1 {

			public static void main(String[] args) {
				//string ,int
				List<Integer> list=new ArrayList<Integer>();
				list.add(20);//0
				list.add(21);//1
				
				list.add(23);//2
				list.add(24);//3
				
				System.out.println("****************ADD************************");
				list.add(2, 31);
				//RYEUS
				
				for(int intiger: list) {
					System.out.println(intiger);
				}
				
				System.out.println("*****************REMOVE****************");
				list.remove(0);
				
				for(int  ref:list) {
					System.out.println(ref);
					
				}
				
				System.out.println("*******************set*************************");
				list.set(0, 19);
				
				for(int ref:list) {
					System.out.println(ref);
				}
				
			
			}
}




				

			




	


