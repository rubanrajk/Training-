package com.training.application;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import com.Details.Customer;
import com.Details.example.InvalidEmailException;
import com.example.demo.utils.LoggingUtility;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = LoggingUtility.getlogger(Application.class);
		FileHandler handler;
		try {
			 handler = new FileHandler("logs.log",true);
			 logger.addHandler(handler);
			 
		} catch (SecurityException e1) {
			
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
//		Customer ram = new Customer();
//		
//		ram.setCusNo(123);
//		ram.setCusName("Ramesh");
//		ram.setCusMno(0123456);
//		ram.setEmailId("abc@email.com");
//		System.out.println(ram);
		
		try {
			Customer shyam = new Customer(102,"shyam",123456,"xyz@email.com");
			logger.info(shyam.toString());
			
		} catch (InvalidEmailException e) {
			
			e.printStackTrace();
		}


	}

}
