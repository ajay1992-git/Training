package com.yash.Array.program;

public class ThirdMaxNumber {
	public static int getThirdLargest(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[total-3];  
        }
    
    
        public static void main(String args[]){  
        int a[]={100,400,6000,1000,1200,20000};  
        
        
        
        System.out.println("Third Largest: "+getThirdLargest(a,6));  
        
    
      }
	
}


