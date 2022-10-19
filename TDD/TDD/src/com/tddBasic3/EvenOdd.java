package com.tddBasic3;

public class EvenOdd {
	public  String evenodd(int num) {
		 int countEven=0;
		 int countOdd=0;
		 while(num>0) {
			 int d=num%10;
			
			 num=num/10;
			 
			 if(d%2==0) 
				 countEven++;
			 else
				 countOdd++;
			 
		 }
		return countEven+" "+countOdd;
		
		
		
	}
}
