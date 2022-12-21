package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {

	
   public static void main(String[] args) {
				
								
								String SoftwareCompanyNames1 = "wipro";
								String SoftwareCompanyNames2 = "TCS";
								String SoftwareCompanyNames3 = "Cognizent";
								String SoftwareCompanyNames4 = "Acuvate";
								String SoftwareCompanyNames5 = "ABC";
								String SoftwareCompanyNames6 = "Cqantino";
								String SoftwareCompanyNames7 = "Capgemini";
								String SoftwareCompanyNames8 = "Accenchear";
								String SoftwareCompanyNames9 = "Maintree";
								String SoftwareCompanyNames10 = "Casio";
								String SoftwareCompanyNames11 = "Microsoft";
								String SoftwareCompanyNames12 = "Amezon";
								String SoftwareCompanyNames13 = "Flipkart";
								String SoftwareCompanyNames14 = "Googal";
								String SoftwareCompanyNames15 = "crome";
								String SoftwareCompanyNames16 = "AWM";
								String SoftwareCompanyNames17 = "Nokia";
								String SoftwareCompanyNames18 = "Samsung";
								String SoftwareCompanyNames19 = "Jio";
								String SoftwareCompanyNames20 = "IT";
								
							    Collection<String> SoftwareCompanyNames = new ArrayList();
							    SoftwareCompanyNames.add(SoftwareCompanyNames1);
							    SoftwareCompanyNames.add(SoftwareCompanyNames2);
							    SoftwareCompanyNames.add(SoftwareCompanyNames3);
							    SoftwareCompanyNames.add(SoftwareCompanyNames4);
							    SoftwareCompanyNames.add(SoftwareCompanyNames5);
							    SoftwareCompanyNames.add(SoftwareCompanyNames6);
							    SoftwareCompanyNames.add(SoftwareCompanyNames7);
							    SoftwareCompanyNames.add(SoftwareCompanyNames8);
							    SoftwareCompanyNames.add(SoftwareCompanyNames9);
							    SoftwareCompanyNames.add(SoftwareCompanyNames10);
							    SoftwareCompanyNames.add(SoftwareCompanyNames11);
							    SoftwareCompanyNames.add(SoftwareCompanyNames12);
							    SoftwareCompanyNames.add(SoftwareCompanyNames13);
							    SoftwareCompanyNames.add(SoftwareCompanyNames15);
							    SoftwareCompanyNames.add(SoftwareCompanyNames16);
							    SoftwareCompanyNames.add(SoftwareCompanyNames17);
							    SoftwareCompanyNames.add(SoftwareCompanyNames18);
							    SoftwareCompanyNames.add(SoftwareCompanyNames19);
							    SoftwareCompanyNames.add(SoftwareCompanyNames20);
							    
							    
							    System.out.println(SoftwareCompanyNames);
							    
							    for(String element : SoftwareCompanyNames) {
							    	System.out.println(element);
							    }
							    
							    System.out.println("Accessed using iterator");
							    
							    Iterator<String> ref = SoftwareCompanyNames.iterator();
							    while(ref.hasNext()) {
							    	String value = ref.next();
							    	System.out.println(value);
							    }
							}

						


					




			




	}


