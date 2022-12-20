package com.xworkz.collections;

import java.util.TreeSet;

public class Copuns {
	public static void main(String[] args) {
		
		String coupoun1="Percent-off coupons";
		String coupoun2="Free shipping coupon.";
		String coupoun3="Free gift with purchase.";
		String coupoun4="Promo codes based on loyalty status";
		String coupoun5="BOGO coupons";
		String coupoun6="East Caribbean dollar";
		String coupoun7="Automatic coupons";
		String coupoun8="Gift card with purchase. ";
		String coupoun9="Friends and family discount codes.";
		String coupoun10="Mystery";
		String coupoun11="Mobile coupons";
		String coupoun12="Computer coupoun";
		
		

		TreeSet<String> collection=new TreeSet<String>();
		
		
		collection.add(coupoun1);
		collection.add(coupoun2);
		collection.add(coupoun3);
		collection.add(coupoun4);
		collection.add(coupoun5);
		collection.add(coupoun6);
		collection.add(coupoun7);
		collection.add(coupoun8);
		collection.add(coupoun9);
		collection.add(coupoun10);
		collection.add(coupoun11);
		collection.add(coupoun12);
		
		collection.add("bike coupoun");
		
		
		
		
		
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("after clear......");
	    System.out.println(collection.size());
		
	}
}


