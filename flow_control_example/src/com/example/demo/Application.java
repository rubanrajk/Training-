package com.example.demo;

import com.example.demo.model.Employee;  

public class Application {

	public static void main(String[] args) {

		Employee ruban = new Employee(102,"Kalai","developer",50000);
		
		Employee shyam = new Employee(102,"Kalai","developer",50000);
		
		boolean isEqual = ruban.equals(shyam);
		
		System.out.println("Expected :True => Actual :="+ isEqual);
		
		Employee oneMoreRuban = ruban;
		
boolean isSame = ruban.equals(oneMoreRuban);
		
		System.out.println("Expected :True => Actual :="+ isSame);
		
		

	}

}
