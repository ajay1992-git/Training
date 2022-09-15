package com.yash.stringPrograms;

public class TwoStringInputByUser_1 {
	
	public static void main(String[] args) {
        String str1 = "Dreamstrue";
        String str2 = "comes";
        int index = 5;



       String s1 = new String();

          for (int i = 0; i < str1.length(); i++) {
            s1 = s1 + str1.charAt(i);
            if (i == index) {
                s1 = s1 + str2;
            }
        }
        System.out.println(s1);
  }
}

