package com.training.mobile1;

import com.training.mobile.Address;
import com.training.mobile.MobileBill;

public class Application {
	

	public static double findAmount(MobileBill bill) {
	
		
		switch(bill.getPlanName()) {
		case "prepaid" :
			return 200;
			
		case "postpaid" :
			return 300;
							
		}
		return 0;
	}

	public static void main(String[] args) {
		
		
		Address address = new Address(15,"kamarajar street","chennai");
		
		MobileBill bill2 = new MobileBill("Raj",012345,"postpaid",address);

	       System.out.println("Expected: 300 =>Actual:="+findAmount(bill2));

	}

}
