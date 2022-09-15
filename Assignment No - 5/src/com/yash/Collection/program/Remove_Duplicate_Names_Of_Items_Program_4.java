package com.yash.Collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate_Names_Of_Items_Program_4 {
	
	 public static void main(String[] args) {
	        
	        List<String> Item=new ArrayList<String>();
	        
	              Item.add("Notebook");
	              Item.add("Headphone");
	              Item.add("Laptop");
	              Item.add("Headphone");
	              Item.add("Notebook");
	            
	        Set<String> RemoveDuplicate=new HashSet<>(Item);
	        
	        System.out.println("After Removing Duplicate: "+ RemoveDuplicate);
	        
	        List<String> sort=new ArrayList<String>(RemoveDuplicate);
	        
	        Collections.sort(sort, Collections.reverseOrder());
	        
	        System.out.println("In descendingorder: "+ sort);
	        
	    }
}
