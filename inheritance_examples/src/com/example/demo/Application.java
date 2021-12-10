package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.service.EmployeeServices;

public class Application {

	public static void main(String[] args) {
	
		Employee ram = new Employee(101,"Kalai","Manager",60000);
		
		String[] skills = {"java","dotnet","testing","mainframe"};
		
		Manager mgr = new Manager(102,"suresh","Manager",70000,skills);
		
		System.out.println(ram);
		System.out.println(mgr.getEmployeeId());
		System.out.println(mgr.getEmployeeName());
		
		for(String eachSkill:mgr.getSkillSet()){
			
		System.out.println((eachSkill));
		
		}
		
		EmployeeServices service =new EmployeeServices();
		Manager mgr1 = new Manager(102,"suresh","Manager",75000,skills);
		Manager mgr2 = new Manager(103,"ramesh","Manager",85000,skills);
		
		Employee[] emplist = {mgr1,mgr2};
		
		service.printEmployees(emplist);
		
		
		
	}
		
	}

