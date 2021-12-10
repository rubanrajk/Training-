package com.Details;

//import com.Id.Employee;
import com.Id.*;

public class CusApp {

	public static void main(String[] args) {
		
//		Customer cus = new Customer(47,"Raja",1234567890);
//		
//	System.out.println(cus.getCusNo());
//	System.out.println(cus.getCusName());
//	System.out.println(cus.getCusMno());
//	
//
//	
//Customer info = new Customer();
////info.setCusNo(47);
////info.setCusName("Raja");
////info.setCusMno(123);
//
//System.out.println(info.getCusNo());
//System.out.println(info.getCusName());
//System.out.println(info.getCusMno());
//
//
//	Hotels sc = new Hotels(309,1500.00,"chennai");
//	
//	System.out.println(sc.getRoomNo());
//	System.out.println(sc.getRoomPrice());
//	System.out.println(sc.getRoomAddress());
//	
//	
//	Hotels ins = new Hotels();
//	ins.setRoomNo(47);
//	ins.setRoomPrice(1200.00);
//	ins.setRoomAddress("Chennai");
//
//	System.out.println(ins.getRoomNo());
//	System.out.println(ins.getRoomPrice());
//	System.out.println(ins.getRoomAddress());


Employee Emp1 = new Employee();



System.out.println(Emp1.getEmpid());
System.out.println(Emp1.getEmpname());
System.out.println(Emp1.getEmpsalary());

EmployeeService last =new  EmployeeService();
System.out.println(last.calculateBonus(Emp1));
	}
	
	}
