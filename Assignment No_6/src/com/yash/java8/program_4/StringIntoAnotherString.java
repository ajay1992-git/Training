package com.yash.java8.program_4;

import java.util.Arrays;
import java.util.List;

public class StringIntoAnotherString {
	
	 public static void main(String[] args) {



	       List<String> list = Arrays.asList("ajay ", "khandekar");



	       StringBuilder sb = new StringBuilder();
	        list.forEach(sb::append);
	        // System.out.println(sb);
	        System.out.println(sb.insert(2, ""));
	        // String con = sb.toString();



	       System.out.println(sb);
	    }

}
