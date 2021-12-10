package com.example.demo.service;

import com.example.demo.model.*;
public class EmployeeServices extends Employee{
	
	private String[] empList;
	
	
	public void printEmployees(Employee[] emplList) {
		
		for(String eachSkill:empList) {
			System.out.println(eachSkill);
		}
			
	}
}


