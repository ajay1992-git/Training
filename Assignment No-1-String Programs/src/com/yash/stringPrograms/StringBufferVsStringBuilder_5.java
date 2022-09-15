package com.yash.stringPrograms;

public class StringBufferVsStringBuilder_5 {
	
	 public static void main(String[] args) {
		 
	        long Time = System.currentTimeMillis();
	        StringBuffer sb = new StringBuffer("yash");
	        for (int i = 0; i < 10000; i++) {
	            sb.append("technology");
	        }
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - Time) + "ms");
	        
	        Time = System.currentTimeMillis();
	        StringBuilder sb2 = new StringBuilder("yash");
	        for (int i = 0; i < 10000; i++) {
	            sb2.append("technology");
	        }
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - Time) + "ms");
	    }
}
