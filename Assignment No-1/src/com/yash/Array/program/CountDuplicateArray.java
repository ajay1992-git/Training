package com.yash.Array.program;

public class CountDuplicateArray {
	
         public static void main(String[] args) {

                int count = 1, temp = 0;
		        
		        int arr[] = { 4,4,5,5,6,7,87,3,45,3};
		        
		        for (int i = 0; i <= arr.length; i++) {
		            
		            for (int j = i + 1; j < arr.length; j++) {
		                
		                if (arr[i] == arr[j]) {
		                    
		                    temp = arr[j];
		                    
		                    count++;
		                    System.out.println(temp + " " + count);
		                
		                }



		           }
		            count = 1;
		       }

         }
  }
