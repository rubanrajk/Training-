package com.example.demo.utils;
import java.util.logging.Logger;

public class LoggingUtility {
	
	public static Logger getlogger(Class clsName) {
		
							String path = clsName
		 		    		  .getClassLoader()
		 		    		  		.getResource("logging.properties")
		 		    		  			.getFile();

				      System.setProperty("java.util.logging.config.file", path);
				      
	return Logger.getLogger(clsName.getName());
	
			
	}

}
