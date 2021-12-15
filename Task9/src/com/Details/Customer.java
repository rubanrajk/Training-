package com.Details;

import com.Details.example.InvalidEmailException;

public class Customer {
	
	
	private int cusNo;
	private String cusName;
	private int cusMno;
	private String emailId;
	public Customer() {
		super();
		
	}
	public Customer(int cusNo, String cusName, int cusMno, String emailId) throws InvalidEmailException{
		super();
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.cusMno = cusMno;
				
		if((emailId.contains("@")) && (emailId.contains(".com")) || (emailId.contains(".org")) || (emailId.contains(".in"))){
		
			this.emailId = emailId;
		}
 		
		else {
			
				throw new InvalidEmailException("Enter valid email id");
			}
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		
		if((emailId.contains("@")) && (emailId.contains(".com")) || (emailId.contains(".org")) || (emailId.contains(".in"))){
			
			this.emailId = emailId;
		}
 		
		else {
			
				try {
					throw new InvalidEmailException("Enter valid email id");
				} catch (InvalidEmailException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	public String getEmail() {
		
		return getEmail();
	}
	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", cusName=" + cusName + ", cusMno=" + cusMno + ", emailId=" + emailId
				+ "]";
	}
	
	}

