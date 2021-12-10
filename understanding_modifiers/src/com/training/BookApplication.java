package com.training;

public class BookApplication {

	public static void main(String[] args) {
		
		Book headFirst = new Book();
		
//		headFirst.setBookId(01);
//		headFirst.setAuthorName("Kathy Sieera");
//		headFirst.setPrice(450.00);
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getPrice());
		

		Book effJava =  new Book("Effective",102,560.00);
		
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getAuthorName());
		System.out.println(effJava.getPrice());
		
	}

}
