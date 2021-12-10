package com.training.json;

public class BookService {
	
	public double Calculatediscount(Book book) {
		
		double price = book.getPrice();
		
		if(price<=500) {
			return price * 0.05;
			
		}
		else if ((price>500) && (price<=1000)) {
			return price * 0.10;
			
		}
		else if (price>1000) {
			return price * 0.12;		
		}
		else {
			return 0;
					}
		
		
	}
	public double Discount(Book book,String customerType) {
		double price = book.getPrice();
		
		switch (customerType) {
		case "Corporate":
		
		if(price<=500) {
			return price * 0.07;
			
		}
		else if ((price>500) && (price<=1000)) {
			return price * 0.12;
			
		}
		else if (price>1000) {
			return price * 0.15;		
		}
		else {
			return 0;
		}
		case "Retail":
			
			if(price<=500) {
				return price * 0.05;
				
			}
			else if ((price>500) && (price<=1000)) {
				return price * 0.10;
				
			}
			else if (price>1000) {
				return price * 0.12;
			}
			else {
				return 0;
			}
		}
		return 0;
	}
}
