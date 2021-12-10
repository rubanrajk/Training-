package com.Details;

public class Customer {
	
	
	private int cusNo;
	private String cusName;
	private int cusMno;
	public Customer() {
		super();
		
	}
	public Customer(int cusNo, String cusName, int cusMno) {
		super();
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.cusMno = cusMno;
	}
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusMno() {
		return cusMno;
	}
	public void setCusMno(int cusMno) {
		this.cusMno = cusMno;
	}

}
