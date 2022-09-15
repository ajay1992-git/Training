package com.yash.Collection.program;

import java.util.ArrayList;
import java.util.Collections;

// WAP to store all Collection elements in Array and perform the Binary Search

public class BinarySearch {
	
	  public static void main(String[] args) {
	        
          ArrayList<Integer> al = new ArrayList<Integer>();
           
            al.add(5);
            al.add(10);
            al.add(15);
            al.add(20);
            al.add(25);
            al.add(30);
            al.add(35);
     
     System.out.println("List of array: "+al);
     
            // Initializing the key to be found
            int val = 20;
        
            int result = Collections.binarySearch(al, val);
           
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("The Element " + val + " is found at "
                                   + "index " + result);
        }


}
