package com.yash.stringPrograms;

public class DemonstrationMemoryHeapAndScp_6 {
	
public static void main(String[] args) {
        
        //String s ="yashtechnology";
        //String s1=new String("yashtechnology");
        
        String s1=new String("yashtechnology");
        String s2=new String("yashtechnology");
        String s3="yashtechnology"; //0
        String s4="yashtechnology"; //0
         System.out.println("s1="+s1+" and hashcode="+s1.hashCode());
         System.out.println("s2="+s2+" and hashcode="+s2.hashCode());
         System.out.println("hashcode s3="+s3.hashCode());
         System.out.println("hashcode s4="+s4.hashCode());
         System.out.println("s1==s3 ="+(s1==s3));
         System.out.println(s1.equals(s2));
  }

}
