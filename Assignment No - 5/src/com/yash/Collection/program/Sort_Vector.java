package com.yash.Collection.program;

import java.util.Collections;
import java.util.Vector;

public class Sort_Vector {
	
	 public static void main(String[] args) {
	        
	        Vector<String> vitem=new Vector<>();
	           vitem.add("Watch");
	           vitem.add("table");
	           vitem.add("laptop");
	           vitem.add("mobile");
	           vitem.add("headphone");
	           
	         Collections.sort(vitem);
	         
	        System.out.println("Sorted vector: "+ vitem);
	           
	           
	    }

}
