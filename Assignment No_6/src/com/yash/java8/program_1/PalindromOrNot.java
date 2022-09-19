package com.yash.java8.program_1;

import java.util.Arrays;

public class PalindromOrNot {

 public static void main(String[] args) {
		        
		        String number="12321";
		        char ch[]=number.toCharArray();
		        char temp[]=new char[number.length()];
		        
		        Check c=()->{
		            int j=0;
		            for(int i=ch.length-1;i>=0;i--) {
		                temp[j++]=ch[i];
		            }
		            if( Arrays.equals(ch, temp)) {
		                System.out.println("number is palindrom");
		            }
		            else {
		                System.out.println("number is not palindrom");
		            }
		        };
		        c.print();
		    }
		}

