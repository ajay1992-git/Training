package com.yash.Array.program;

public class VowelsAndConsonent_8 {
	
	public static void main(String[] args) {

        String str = "yashtechnology";
         char[] a = str.toCharArray();

           System.out.println("The vowels are");
	        
	        System.out.print("{");

        for (int i = 0; i < a.length; i++) {

         if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

           continue;
          }

       System.out.print(a[i]+",");

         }

       System.out.print("}");
	        
	   System.out.println();

       System.out.println("The consonents are ");
	        
	   System.out.print("{");

            for (int i = 0; i < a.length; i++) {

              if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

                 System.out.print(a[i] + ",");
	                
                 }
	       }
	        System.out.print("}");
	    }
	}


