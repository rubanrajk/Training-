package com.Id;

public class Employee {
	
	private int empid;
	private String empname;
	private double empsalary;
	public Employee() {
//		super();
		this(123, "Raj", 120000);
	
	}
	public Employee(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
	

		
	}


