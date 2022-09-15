package com.yash.stringPrograms;

public class AlphabetAscendingandDescendingOrder_2 {
	
	public static void main(String[] args) {
		 String s1="pune hinjewadi";
		  char a[] =s1.toCharArray();
		   System.out.println("Ascending orders are:");
		    for(int i = 0; i< a.length;i++) {
		    	for(int j = i+1; j< a.length; j++) {
		    		if(a[i] >a[j]) {
		    			char temp = a[i];
		    			a[i]=a[j];
		    			a[j]=temp;
		    		}
		    		
		    	}
		    	System.out.println(a[i] +" ");
			  }
	            System.out.println(" ");
	            System.out.println("Descending orders are :");
	            for(int i = 0; i < a.length; i++) {
	            	for(int j = i; j < a.length;j++) {
	            		if(a[i] < a[j]) {
	            			char temp = a[i];
	            			a[i]=a[j];
	            			a[j]=temp;
	            		}
	            	}
	            	System.out.println(a[i]+ " ");
	            }
		}

	}

