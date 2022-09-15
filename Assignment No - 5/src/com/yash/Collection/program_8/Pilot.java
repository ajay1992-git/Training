package com.yash.Collection.program_8;

import java.time.LocalDate;

public class Pilot {
	
	 public static void main(String[] args) {
	        
		    int i=10%5;
		    System.out.println(i);
		        
		         
		    String[] stArr = new String[] { "xyz", "mno" };
		    ProductionFacility pf = new  ProductionFacility();
		    ProductionFacility pd1 = new ProductionFacility(501, "pfFacility1", "Jalgaon", 10, stArr, LocalDate.now());
		    ProductionFacility pd2 = new ProductionFacility(502, "pfFacility2", "Jalgaon", 12, stArr, LocalDate.now());
		    ProductionFacility pd3 = new ProductionFacility(503, "pfFacility3", "Jalgaon", 13, stArr, LocalDate.now());
		    
		    }

}
