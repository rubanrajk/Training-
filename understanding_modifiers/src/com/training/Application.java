package com.training;

public class Application {

	public static void main(String[] args) {
		
		Student raj = new Student();
		
		//can`t access firstName because its marked private
		//System.out.println(raj.firstName);
		//can access fees because it marked default (its package scope)
		System.out.println(raj.fees);
		

	}

}
