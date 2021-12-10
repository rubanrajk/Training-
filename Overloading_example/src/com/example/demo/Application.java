package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.service.EmployeeServices;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// Using wrapper class,parsing the string representation to respective types
		
		int employeeId = Integer.parseInt(args[0]);
		String employeeName = args[1];
		String designation = args[2];
		double salary = Double.parseDouble(args[3]);
		
		Employee ruban = new Employee(102,"Kalai","developer",50000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter the Employee Name");
			String empName = sc.next();
		
		System.out.println("Enter the Employee Designation");
			String empDesignation = sc.next();
		
		System.out.println("Enter the Employee Salary");
			double empSalary = sc.nextDouble();
		
		Employee shyam = new Employee(empId,empName,empDesignation,empSalary);
		
		sc.close();
		
		//calling the overLoaded Methods
		
		EmployeeServices service = new EmployeeServices();
		
		System.out.println("Expected: 16500 =>Actual:="+service.calculateBonus(ruban.getSalary()));
		
		System.out.println("Expected: 19800 =>Actual:="+service.calculateBonus(shyam.getSalary()));

		//casting
		Double salary1 = Double.valueOf(50000);
		
		int intSalary1 = (int)(salary1.doubleValue());
		
		double salary3 = salary1.doubleValue();
		
		int salary4=(int)salary3;
		
		System.out.println("Expected: 17500 =>Actual:="+service.calculateBonus(salary1));
		
		

		Employee sundar = new Employee(130,"sundar","Sales",70000);
		
		System.out.println("Before :="+sundar.getSalary());
		service.updateSalary(sundar);
		System.out.println("After :="+sundar.getSalary());

		System.out.println("Expected:90000  =>Actual:="+sundar.getSalary());
		
		
		
		Invoice.showAll();
		Invoice.showAll1();

	}

}
