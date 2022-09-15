package com.yash.Oops.program_2;

import java.util.Scanner;

public class Square implements Shape {
	
	  @Override
	    public void area()
	    {
	        double a,s = 5;
	          Scanner sc = new Scanner(System.in);



	         System.out.println("Enter the side of the square:"+s);
	          s = sc.nextDouble();



	         a = s*s;
	          System.out.println("Area of the square is: " + a);            
	    }
	

}
