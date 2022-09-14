package com.yash.Array.program;

public class SortArrayBasedOnLengthOfString_10 {
	
	 public static void main(String[] args) {
           /*
	         * You are having array of strings. Now you have to arrange strings in
	         * array on the basis of the length of each string. Smallest string will
	         * be first and so on.
	         */
          String a[] = { "developers", "all", "software", "are","we","human and living things"};

            for (int i = 0; i < a.length; i++) {
	            
	            for (int j = i+1; j < a.length; j++) {
	                if (a[i].length() > a[j].length()) {

                     String temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;

	                }

                }
	            System.out.println(a[i]);
               }

             }
          }


