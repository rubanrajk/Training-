package com.assessment.sort;
import java.util.*;
public class Application1 {

public static void main(String[] args) {

		 List<Integer> myList = Arrays.asList(1,5,2,1,2,6,7,1);
			Set<Integer> mySet = new HashSet<Integer>(myList);
			for(Integer eachNumber: mySet) {
				System.out.println("Occurrence of:"+eachNumber+ " ="  +Collections.frequency(myList, eachNumber) + myList.indexOf(eachNumber));
			 
		
	}

	}

}
