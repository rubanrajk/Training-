package com.example.demo.service;

import com.example.demo.model.*;

public class EmployeeServices {
	
	//DRY Principle followed
	public double calculateBonus(Employee employee) {
		
		//return 0.0;
		
		return calculateBonus(employee.getSalary());
	}
	
	//Overloaded Method
	
	public double calculateBonus(double salary) {
		
		//return 0.0;
		
		return salary * .33;
	}
	
	// overloaded Method with autoboxing
	
	public double calculateBonus(Double salary) {
		return salary * 0.33 + 1000;
	}
	public Employee updateSalary(Employee employee) {
		
		double updateSalary = employee.getSalary()+20000;
		
		employee.setSalary(updateSalary);
		
		return employee;
	}
}
