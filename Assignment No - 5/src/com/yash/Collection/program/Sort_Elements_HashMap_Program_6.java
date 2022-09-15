package com.yash.Collection.program;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Elements_HashMap_Program_6 {
	
	 public static void main(String[] args) {

          Map<String, Integer> map = new HashMap<String, Integer>();

            map.put("pune", 1200000);
	        map.put("nagpur", 4000000);
	        map.put("amravati", 7800000);
	        map.put("chandrapur", 4600000);
	        map.put("indore", 3200000);



	       TreeMap<String, Integer> treemap = new TreeMap<>();
	        treemap.putAll(map);



	       // System.out.println(treemap);



	       for (Map.Entry<String, Integer> entry : treemap.entrySet())
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	    }



}
