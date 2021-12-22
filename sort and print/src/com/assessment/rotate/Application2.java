package com.assessment.rotate;

public class Application2 {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 5}; 
        int m = 2;
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }
        for(int i = 0; i < m; i++){  
            int j, first; 
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];  
            } 
            arr[j] = first;  
        }  
        System.out.println();
        System.out.println(" After Left Rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }
        int n =2;
        
        for(int i = 0; i < n; i++){  
            int j, first; 
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];  
            } 
            arr[j] = first;  
        }  
        System.out.println();
        System.out.println(" After Left Rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }
        
        int p =6;
        
     for(int i = 0; i < p; i++){  
          int j, first; 
          first = arr[0];  
          for(j = 0; j < arr.length-1; j++){
              arr[j] = arr[j+1];  
          } 
          arr[j] = first;  
      }  
      System.out.println();
      System.out.println(" After Left Rotation: ");  
      for(int i = 0; i< arr.length; i++){  
          System.out.print(arr[i] + " ");  
      }

	}

}
