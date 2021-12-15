package com.example.demo.utils;

public class StringUtility {
	
	
	public static String getSubString(String arg) {
		
		return arg.substring(2);
			
	}
	
	public static boolean checkContains(String arg, String srchChar) {
		
	return arg.contains(arg);
		
	}
	public static int CheckPositionOfChar(String arg, String srchChar) {
		
	return arg.indexOf(srchChar);
		
	}
	
	public static String joinTwoStrings(String str1, String str2) {
		
		return str1.concat(str2);
		
	}
	
	public static String replaceString(String originalString, String replaceString) {
		
		return originalString.replace(originalString, replaceString);
		
	}
	
	public static String changeToUpperCase(String arg) {
		return arg.toUpperCase();
	}
	public static String changeToLowerCase(String arg) {
		return arg.toLowerCase();
	}
	public static String trim(String arg) {
		return arg.trim();
	}
}
