package com.yash.Collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_Program_3 {

            public static void main(String[] args) {
			
		    List<Integer> Numbers = new ArrayList<Integer>();
		    
		        Numbers.add(10);
		        Numbers.add(12);
		        Numbers.add(9);
		        Numbers.add(9);
		        Numbers.add(11);
		    
		       Collections.sort(Numbers);    
		        
		    Set<Integer> Removeduplicate=new HashSet<>(Numbers);
		    
		    System.out.println("After Removing duplicates: " +Removeduplicate);
		    
		    



		   }


	}

