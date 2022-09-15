package com.yash.stringPrograms;

public class NumberOfAlphabet_4 {
	
	public static void main (String[] args) {
        
        String s="aabbccddeetyu";
        
        int count=0;
        
        char[] cs = s.toCharArray();
        
        for(int i=0; i< cs.length-1; i++)
        {
           for (int j = i+1; j < cs.length; j++) {
                
                if(cs[i]==cs[j])
                {
                    count++;
                }
                break;
        }
           
    }
        System.out.println(count);
  }
}

