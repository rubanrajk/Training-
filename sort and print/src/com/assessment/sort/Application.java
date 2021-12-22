package com.assessment.sort;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		List<String> fruit = Arrays.asList("apple", "orange", "apple", "pineapple", "orange", "banana");
		
		System.out.println("input="+fruit);
		Set<String> hashSet = new LinkedHashSet(fruit);
		
		ArrayList<String> Duplicate = new ArrayList(hashSet);
		
		System.out.println("output="+Duplicate);

}
}
