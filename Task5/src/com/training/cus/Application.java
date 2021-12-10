package com.training.cus;
import java.util.Scanner;

import com.training.json.Book;
import com.training.json.BookService;
public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookService bs = new BookService();
		System.out.println("Enter the Id");
		int bookId = sc.nextInt();
		
		System.out.println("Enter the Book Name");
			String bookName = sc.next();
		
		System.out.println("Enter the author name");
			String bookAuthor = sc.next();
		
		System.out.println("Enter the price");
			double bookPrice = sc.nextDouble();
			
			
			Book book = new Book(bookId,bookName,bookAuthor,bookPrice);
			System.out.println("Enter type");
			String type = sc.next();
		
		 
		System.out.println(bs.Calculatediscount(book));
		
		System.out.println(bs.Discount(book,type));
		
		
		
		sc.close();
		
		

	}

}
