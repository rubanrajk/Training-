package com.example.demo.model;

import static java.lang.Math.*;

public class Invoice {
	
	//Declaring a Constant - Note the all CAPS
	public static final int STARTNUMBER =100; 
	
	private int invoiceNumber;    //instance variable
	
	private static double discount;  // static or class variable	
	
	public void show() {  	// instance Method can access both instance and static variable
		
		System.out.println(invoiceNumber);
		System.out.println(discount);
		//STARTNUMBER++; it is constant 
		
		showAll();
	}
	
		// instance Method can access ONLY  static variable
		// and static method
	
	public static void showAll() {
		
// System.out.println(invoiceNumber);     because in static method cannot call instance method
		System.out.println(discount);
		
		// show();
		
	System.out.println(Math.sqrt(4));
	
	double radian30 = Math.toRadians(30);
	
	double radian60 = Math.toRadians(60);
	
	System.out.println(Math.sin(radian30));
	
	System.out.println(Math.cos(radian60));
	
	
	}
	
	
	public static void showAll1() {
		
		// System.out.println(invoiceNumber);     because in static method cannot call instance method
				System.out.println(discount);
				
				// show();
				
System.out.println(sqrt(4)); //  since static import is used we are not calling methods with class name
			
			double radian30 = toRadians(30);
			
			double radian60 = toRadians(60);
			
			System.out.println(sin(radian30));
			
			System.out.println(cos(radian60));
		
		
	}
	
	
	
	

}
